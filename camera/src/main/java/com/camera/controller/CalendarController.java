package com.camera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("Calendar")
public class CalendarController {

	@RequestMapping("/calendar")
	public ModelAndView calendar(){
		return new ModelAndView("calendar");
	}
	
	
}
