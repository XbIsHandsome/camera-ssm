package com.camera.service;

import java.util.List;

import com.camera.model.SycrohProfile;

public interface HistoryService {

	public List<?> showall();

	public List<SycrohProfile> selectByTimeAndDay(Integer weektime, Integer weekday);
	
}
