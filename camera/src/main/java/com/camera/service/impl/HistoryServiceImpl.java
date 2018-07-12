package com.camera.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camera.dao.ClassCourseMapper;
import com.camera.dao.NattendMapper;
import com.camera.dao.StudentMapper;
import com.camera.model.ClassDetail;
import com.camera.model.HistoryProfile;
import com.camera.service.HistoryService;
import com.camera.util.TimeUtil;

/**
 * @author 许兵
 * @description 历史课程模块的业务层实现类
 * @date 2018年7月12日,上午9:01:37
 */
@Service
public class HistoryServiceImpl implements HistoryService{

	@Autowired
	private ClassCourseMapper classCourseMapper;
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Autowired 
	private NattendMapper nattendMapper;
	
	
	public List<?> showall() {
		return null;
	}

	/**
	 * 根据传入的周数和星期数，返回当天所有的课程
	 * @param weektime
	 * @param weekday
	 * @return List<HistoryProfile>
	 */
	public List<HistoryProfile> selectByTimeAndDay(Integer weektime, Integer weekday) {
		List<HistoryProfile> list = classCourseMapper.selectByWeekAndDayOfWeek(weektime,weekday);
		if(!list.isEmpty() && list != null){
			int lateCount = 0;
			for (HistoryProfile historyProfile : list) {
				List<ClassDetail> list2 = studentMapper.selectStudentByCid(historyProfile.getCid());
				for (ClassDetail classDetail : list2) {
					Integer status = nattendMapper.selectIsLate(TimeUtil.countCurrentDayWeek(),
							TimeUtil.countCurrentCourseTime(),classDetail.getSid(), weekday);
					if(status != null){
						classDetail.setState(2);
						lateCount++;
					}
					if(classDetail.getState() == null){
						classDetail.setState(0);
					}
				}
				historyProfile.setNum(list2.size());
				historyProfile.setActualNum(historyProfile.getNum() - lateCount);
				historyProfile.setWeelTime(weektime);
				historyProfile.setWeekday(weekday);
				historyProfile.setStudents(list2);
			}
		}
		return list;
	}

	public List<ClassDetail> selectClassDetailBy(Integer weektime, Integer weekday, Integer cid,Integer csid,Integer time){
		List<ClassDetail> list2 = studentMapper.selectStudentByCid(cid);
		for (ClassDetail classDetail : list2) {
			Integer status = nattendMapper.selectIsLate(weektime, time,classDetail.getSid(), weekday);
			if(status != null){
				classDetail.setState(2);
			}else{
				classDetail.setState(0);
			}
			//(status == null) ? classDetail.setState(2) : classDetail.setState(0);
		}
		return list2;
	}
	
	
}
