package com.camera.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.camera.model.ClassCourse;
import com.camera.service.CourseService;

/**
 * @author 许兵
 * @description 课程管理模块，主要分为两部分，添加课程，删除课程
 * @date 2018年7月13日,上午9:06:40
 */

@Controller
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	//日志打印类
	Logger logger = Logger.getLogger(CourseController.class);
	
	@RequestMapping("/courseManage")
	public ModelAndView courseManage(){
		return new ModelAndView("courseindex");
	}
	
	
	@RequestMapping("/addCoursePage")
	public ModelAndView functionSelect(Integer functionSelect){
		ModelAndView mav = new ModelAndView();
		logger.info("进入课程管理模块--->添加课程界面");
		Map<Integer, String> mapClassNames = courseService.getAllClass();
		logger.info(JSON.toJSON(mapClassNames));
		mav.addObject("mapClassNames",mapClassNames);
		mav.setViewName("addcourse");
		return mav;
	}
	
	
	@RequestMapping("/addCourse")
	public ModelAndView addCourse(String coursename, ClassCourse cc){
		logger.info("进入课程管理模块--->添加课程");
		logger.info("课程名称--->" + coursename);
		logger.info("班级课程表--->" + JSON.toJSONString(cc));
		ModelAndView mav = new ModelAndView();
		courseService.addCourse(coursename, cc);
		mav.setViewName("success");
		return mav;
	}
	
	
	@RequestMapping("/deleteCourse")
	public ModelAndView deleteCourse(ClassCourse classCourse){
		ModelAndView mav = new ModelAndView();
		courseService.deleteCourse(classCourse);
		mav.setViewName("success");
		return mav;
		
		
	}
}
