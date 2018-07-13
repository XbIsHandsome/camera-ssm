package com.camera.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.camera.model.ClassDetail;
import com.camera.model.HistoryProfile;
import com.camera.service.HistoryService;
import com.camera.util.TimeUtil;

/**
 * @author 许兵
 * @description 历史课程模块
 * @date 2018年7月12日,下午3:10:49
 */
@Controller
@RequestMapping("/history")
public class HistoryController {

	//日志打印对象
	Logger logger = Logger.getLogger(HistoryController.class);
	
	@Autowired
	private HistoryService historyService;	//注入历史模块业务处理类
	
	
	/**
	 * 根据传入的参数，调用业务类进行查询当前条件下的所有课程信息
	 * @param weektime 第几周
	 * @param weekday 星期几
	 * @return
	 */
	@RequestMapping("/showall")
	public ModelAndView showByWeek(Integer weektime, Integer weekday, Integer time){
		logger.info("进入历史课程--->根据传入参数显示当前所有信息...");
		logger.info("周数："+weektime+";星期数:"+weekday+";第几节课:"+time);
		ModelAndView mav = new ModelAndView();
		List<HistoryProfile> historyList = historyService.selectByTimeAndDay(weektime, weekday,time);
		mav.addObject("historyList", historyList);
		mav.setViewName("history");
		return mav;
	}
	/**
	 * 显示所选课程的详细信息
	 * @param profile 传入当前选中班级
	 * @return
	 */
	@RequestMapping("/historydetail")
	public ModelAndView showdetail(HistoryProfile profile){
		logger.info("进入历史课程--->根据传入参数显示所选的学生详细信息...");
		logger.info("传入参数信息--->" + JSON.toJSON(profile));
		ModelAndView mav = new ModelAndView();
		List<ClassDetail> list = historyService.selectClassDetailBy(profile.getWeekTime(), profile.getWeekday(), 
				profile.getCid(), profile.getCsid(), TimeUtil.turnInteger(profile.getTime()));
		//日志打印输出查询到的信息
		logger.info(JSON.toJSON(list));
		
		if(!list.isEmpty() && list != null){
			mav.addObject("studentList", list);
			mav.addObject("currentClass", profile);
			mav.setViewName("classdetail");
		}else{
			mav.addObject("ERROR", "信息未能检索到");
			mav.setViewName("error");
		}
		return mav;
		
	}
	
	
	
	
	
	
	
	
	
	
}
