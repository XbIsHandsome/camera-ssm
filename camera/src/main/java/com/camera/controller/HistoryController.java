package com.camera.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.camera.service.StaticService;

@Controller
@RequestMapping("/history")
public class HistoryController {

	@Autowired
	private StaticService staticService;
	
	@RequestMapping("/showall")
	public ModelAndView showall(){
		
		return null;
	}
	
}
