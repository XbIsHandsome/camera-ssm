package com.camera.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camera.dao.ClassCourseMapper;
import com.camera.dao.CourseMapper;
import com.camera.dao.StuclassMapper;
import com.camera.model.ClassCourse;
import com.camera.model.Course;
import com.camera.model.Stuclass;
import com.camera.service.CourseService;

/**
 * @author 许兵
 * @description 课程模块的业务逻辑实现类
 * @date 2018年7月13日,上午9:41:09
 */
@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseMapper courseMapper;	//自动注入对应课程表的DAO
	
	@Autowired
	private StuclassMapper stuclassMapper;	//自动注入对应班级表的DAO
	
	@Autowired 
	private ClassCourseMapper classCourseMapper;	//自动注入班级课程表DAO
	
	Logger logger = Logger.getLogger(this.getClass());
	
	@Override
	public boolean isRepeated(String coursename) {
		//如果存在返回true，如果不存在返回false
		return courseMapper.isRepeatedByCoursename(coursename)==null?false:true;	
	}

	@Override
	public boolean isRepeated(String coursename, Integer cid) {
		//如果存在返回true，如果不存在返回false
		return courseMapper.isRepeatedByCoursenameAndCid(coursename, cid)==null?false:true;
	}

	@Override
	public Map<Integer, String> getAllClass() {
		List<Stuclass> listStuclass = stuclassMapper.selectClassName();
		Map<Integer,String> listClassNames = new HashMap<>();
		StringBuilder sb = null;
		for (Stuclass stuclass : listStuclass) {
			sb = new StringBuilder();
			sb.append(stuclass.getGrade()).append(stuclass.getClassName()).append(stuclass.getNumber());
			listClassNames.put(stuclass.getCid(), sb.toString());
		}
		return listClassNames.isEmpty()?null:listClassNames;
	}

	@Override
	public boolean addCourse(String coursename, ClassCourse classCourse) {
		//构建插入课程表的实体类
		Course needAddcourse = new Course();
		needAddcourse.setCoursename(coursename);
		needAddcourse.setWarning("30");
		
		logger.info("添加课程业务类中，添加课程的名称--->" + coursename);
		//插入成功，并且能够使用查询语句能够查询到该课程的主键ID
		Integer insertCourseFlag = courseMapper.insert(needAddcourse);
		Integer courseId = courseMapper.selectCsidByCoursename(coursename);
		
		//构建插入班级-课程表的实体类
		classCourse.setCsid(courseId);
		 //该字段目前设置为默认的“第一学期”
		classCourse.setSemester("第一学期");
		
		logger.info("记录当前插入班级课程表的数据--->" + classCourse);
		//往班级课程表中插入该条上课数据
		Integer insertClassCourseFlag = classCourseMapper.insert(classCourse);

		return (insertCourseFlag != null && insertClassCourseFlag != null)?true:false;
	}

	@Override
	public boolean deleteCourse(ClassCourse classCourse) {
		
		//首先要删除班级课程表中的该条数据
		//由于班级不用删除，只级联删除该乘客，所以此处不能使用级联删除
		//做法：先删除班级课程表的数据，再对课程表进行删除操作
		//删除班级课程表
		int deleteClassCourseFlag = classCourseMapper.deleteByPrimaryKey(classCourse.getCcid());
		//删除课程表
		int deleteCourseFlag = courseMapper.deleteByPrimaryKey(classCourse.getCsid());
		//删除成功返回true，失败则返回false
		return  (deleteClassCourseFlag==1 && deleteCourseFlag==1)?true:false;
	}

}
