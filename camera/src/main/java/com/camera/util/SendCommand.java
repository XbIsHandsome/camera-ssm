package com.camera.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.camera.dao.NattendMapper;
import com.camera.dao.StuclassMapper;
import com.camera.dao.StudentMapper;
import com.camera.model.Nattend;
import com.camera.model.Student;
import com.camera.model.SycrohProfile;

@Component
public class SendCommand {

	//连接远程摄像头
	private RemoteController controller = new RemoteController("172.16.40.61", "ubuntu", "ubuntu", "ubuntu", "ubuntu");
	
	@Autowired
	private StuclassMapper stuclassMapper;
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Autowired
	private NattendMapper nattendMapper;

	public void sycrSendCommand(){
		System.out.println("北京时间：" + new Date() );
		//查询当前时间段正在上课的所有班级
		List<Integer> findClassCourse = this.stuclassMapper.selectCurrentCourse(
				TimeUtil.countCurrentDayWeek(), TimeUtil.countCurrentCourseTime());
		//根据班级cid查找改班级所有学生的训练模型信息
		List<Student> students = null;
		for (Integer integer : findClassCourse) {
			students = studentMapper.selectStudentModelByCid(integer);
		}
		try {
			//new一个输入流，远程端接受输入流
			List<InputStream> in = new ArrayList<InputStream>();
			int lable[] = new int[100];
			//构建传输的数据
			for (int i=0;i<students.size();i++) {
				in.add(i, new FileInputStream(new File(students.get(i).getModel().getModelFile())));
				lable[i] = students.get(i).getSid();
			}
			controller.runXML(students.size(), in, lable);
			List<Integer> runRF = controller.runRF(1.0);
			
			
		} catch (NullPointerException e) {
			System.out.println("获取模型信息失败！！！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 训练的模型文件在摄像头本地，此次测试主要是寻找错误原因
	 */
	public void testSendCommand(){
		System.out.println("开始执行...");
		List<Integer> runRF = controller.runRF(1.0);
		
		System.out.println("返回数据打印中：");
		for(int i=0;i<runRF.size();i++){
			System.out.println(runRF.get(i));
		}
		
	}
	
	/**
	 * 测试一节课一个班级的发送
	 */
	public void testOneClass(){
		System.out.println("北京时间：" + new Date() );
		//查询课的所有班级,班级id写死了
		SycrohProfile profile = this.stuclassMapper.selectOneClass(15, 1, 1);
		
		//根据班级cid查找改班级所有学生的训练模型信息
		List<Student> students = studentMapper.selectStudentModelByCid(profile.getCid());
		try {
			//new一个输入流，远程端接受输入流
			List<InputStream> in = new ArrayList<InputStream>();
			int lable[] = new int[100];
			//构建传输的数据
			for (int i=0;i<students.size();i++) {
				in.add(i, new FileInputStream(new File(students.get(i).getModel().getModelFile())));
				lable[i] = students.get(i).getSid();
			}
			controller.runXML(students.size(), in, lable);
			List<Integer> runRF = controller.runRF(1.0);
			for (int i=0; i<runRF.size(); i++) {
				if(runRF.get(i) == 0){
					Nattend record = new Nattend();
					record.setTime(new Date());
					record.setSid(lable[i]);
					record.setCid(profile.getCid());
					record.setState(2);
					record.setCsid(profile.getCsid());
					record.setSemester(profile.getSemester());
					record.setWeek(TimeUtil.countCurrentDayWeek());
					record.setCourseTime(TimeUtil.countCurrentCourseTime());
					nattendMapper.insert(record);
				}
			}
			
		} catch (NullPointerException e) {
			System.out.println("获取模型信息失败！！！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
