package com.camera.service;

import java.util.List;

import com.camera.model.ClassDetail;
import com.camera.model.SycrohProfile;

public interface SycrohService {

	/**
	 * 业务层
	 * 返回当前所有正在上课的班级的相关信息
	 * @return
	 */
	public List<SycrohProfile> showall();
	
	/**
	 * 业务层
	 * 根据cid返回改班级的所有学生状态信息
	 * @param cid
	 * @return
	 */
	public List<ClassDetail> showdetail(Integer cid);

	
	
}
