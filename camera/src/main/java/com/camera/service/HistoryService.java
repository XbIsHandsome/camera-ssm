package com.camera.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.camera.model.ClassDetail;
import com.camera.model.HistoryProfile;

/**
 * @author 许兵
 * @description 
 * @date 2018年7月12日,上午9:53:34
 */
@Service
public interface HistoryService {

	public List<?> showall();

	/**
	 * 根据第几周，周几来查询当天的所有课程信息
	 * @param week
	 * @param weekday
	 * @return
	 */
	public List<HistoryProfile> selectByTimeAndDay(Integer week, Integer weekday);
	
	/**
	 * 根据输入的参数，返回选择的历史课程该班级的所有学生到课详情（此处还可以优化）
	 * @param weektime 周数
	 * @param weekday 星期数
	 * @param cid 班级主键ID
	 * @param csid 课程主键ID
	 * @param time 第几节课
	 * @return List<ClassDetail> 返回构建的学生到课详情的List
	 */
	public List<ClassDetail> selectClassDetailBy(Integer weektime, Integer weekday, Integer cid,Integer csid,Integer time);
	
}
