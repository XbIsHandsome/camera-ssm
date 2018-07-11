package com.camera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.camera.model.ClassDetail;
import com.camera.model.SycrohProfile;
import com.camera.service.SycrohService;

@Controller
@RequestMapping("/sycroh")
public class SycrohController {

	@Autowired
	private SycrohService sycrohServce;
	
	/**
	 * 实时查询所有班级信息
	 * @return
	 */
	@RequestMapping("/showall")
	public ModelAndView currentClass(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("classList", sycrohServce.showall());
		mav.setViewName("synchroAll");
		return mav;
	}
	
	/**
	 * 根据CID实时查询该班的实情况
	 * @param cid
	 * @return
	 */
	@RequestMapping("/showdetail")
	public ModelAndView showdetail(Integer cid,String time,String place){
		ModelAndView mav = new ModelAndView("classdetail");
		SycrohProfile profile = new SycrohProfile();
		profile.setCid(cid);
		profile.setPlace(place);
		profile.setTime(time);
		List<ClassDetail> list = sycrohServce.showdetail(cid);
		if(!list.isEmpty() && list != null){
			mav.addObject("studentList", list);
			mav.addObject("currentClass", profile);
		}else{
			mav.addObject("ERROR", "信息未能检索到");
			mav.setViewName("error");
		}
		return mav;
	}
	
}
