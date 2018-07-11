package com.camera.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camera.dao.ClassCourseMapper;
import com.camera.model.SycrohProfile;
import com.camera.service.HistoryService;
import com.camera.util.TimeUtil;

@Service
public class HistoryServiceImpl implements HistoryService{

	@Autowired
	private ClassCourseMapper classCourseMapper;
	
	
	public List<?> showall() {
		return null;
	}

	public List<SycrohProfile> selectByTimeAndDay(Integer weektime, Integer weekday) {
		
		
		return null;
	}

	
	
	
}
