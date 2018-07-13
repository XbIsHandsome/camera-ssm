package com.camera.service;

import java.util.Map;

import com.camera.model.ClassCourse;

/**
 * @author 许兵
 * @description 课程模块的业务层
 * @date 2018年7月13日,上午9:46:11
 */
public interface CourseService {

	/**
	 * 判断当前课程是否已经存在
	 * @param coursename 课程名称
	 * @return
	 */
	public boolean isRepeated(String coursename);
	
	/**
	 * 判断当前班级是否已经有该课程
	 * @param coursename 课程名称
	 * @param cid 班级对应的主键ID
	 * @return
	 */
	public boolean isRepeated(String coursename,Integer cid);
	
	/**
	 * 为添加课程模块返回所有存在班级
	 * @return List<Stuclass> 返回班级列表
	 */
	public Map<Integer, String> getAllClass();
	
	/**
	 * 对数据进行处理封装，完成后调用DAO类往数据库插入数据
	 * @param coursename 课程名称
	 * @param cc 课程与班级的多对多关联信息，插入class_course表
	 * @return 返回添加结果
	 */
	public boolean addCourse(String coursename, ClassCourse cc);

	/**
	 * 删除已经存在的课程
	 * @param classCourse 班级课程对应表，然后根据相应的课程id删除课程表中的数据
	 * @return 返回删除结果
	 */
	public boolean deleteCourse(ClassCourse classCourse);
	
}
