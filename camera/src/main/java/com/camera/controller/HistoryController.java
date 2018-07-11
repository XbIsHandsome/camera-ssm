package com.camera.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.camera.service.HistoryService;

@Controller
@RequestMapping("/history")
public class HistoryController {

	@Autowired
	private HistoryService historyService;
	
	@RequestMapping("/showall")
	public ModelAndView showByWeek(Integer weektime, Integer weekday){
		historyService.selectByTimeAndDay(weektime, weekday);
		return null;
	}
	
}
