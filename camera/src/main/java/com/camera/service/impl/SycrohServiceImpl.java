package com.camera.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camera.dao.NattendMapper;
import com.camera.dao.StuclassMapper;
import com.camera.dao.StudentMapper;
import com.camera.model.ClassDetail;
import com.camera.model.Stuclass;
import com.camera.model.SycrohProfile;
import com.camera.service.SycrohService;
import com.camera.util.TimeUtil;

@Service
public class SycrohServiceImpl implements SycrohService{

	@Autowired
	private StuclassMapper stuclassMapper;
	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private NattendMapper nattendMapper;
	
	
	public List<SycrohProfile> showall() {
		List<SycrohProfile> list = this.stuclassMapper.selectSycrohClass(TimeUtil.countCurrentDayWeek(),
				TimeUtil.countCurrentCourseTime());
		if(!list.isEmpty() && list != null){
			int lateCount = 0;
			for (SycrohProfile sycrohProfile : list) {
				List<ClassDetail> list2 = studentMapper.selectStudentByCid(sycrohProfile.getCid());
				for (ClassDetail classDetail : list2) {
					Integer status = nattendMapper.selectIsLate(TimeUtil.countCurrentDayWeek(),
							TimeUtil.countCurrentCourseTime(),classDetail.getSid());
					if(status != null){
						classDetail.setState(2);
						lateCount++;
					}
					if(classDetail.getState() == null){
						classDetail.setState(0);
					}
				}
				sycrohProfile.setNum(list2.size());
				sycrohProfile.setActualNum(sycrohProfile.getNum() - lateCount);
				sycrohProfile.setStudents(list2);
			}
		}
		return list;
	}
	
	/**
	 * 显示班级详细到课
	 * @return
	 */
	public List<ClassDetail> showdetail(Integer cid){
		for (SycrohProfile sycrohProfile : this.showall()) {
			if(sycrohProfile.getCid() == cid){
				return sycrohProfile.getStudents();
			}
		}
		return null;
	}

}
