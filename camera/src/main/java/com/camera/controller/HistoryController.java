package com.camera.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.camera.model.HistoryProfile;
import com.camera.service.HistoryService;
import com.camera.util.TimeUtil;

@Controller
@RequestMapping("/history")
public class HistoryController {

	Logger logger = Logger.getLogger(HistoryController.class);
	@Autowired
	private HistoryService historyService;
	
	
	@RequestMapping("/showall")
	public ModelAndView showByWeek(Integer weektime, Integer weekday){
		logger.info("进入历史课程--->根据传入参数显示当前所有信息...");
		ModelAndView mav = new ModelAndView();
		List<HistoryProfile> historyList = historyService.selectByTimeAndDay(15, 2);
		mav.addObject("historyList", historyList);
		mav.setViewName("history");
		return mav;
	}
	
	public ModelAndView showdetail(HistoryProfile profile){
		logger.info("进入历史课程--->根据传入参数显示所选的学生详细信息...");
		ModelAndView mav = new ModelAndView();
		historyService.selectClassDetailBy(profile.getWeelTime(), profile.getWeekday(), 
				profile.getCid(), profile.getCsid(), TimeUtil.turnInteger(profile.getTime()));
		mav.addObject(attributeName, attributeValue)
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
