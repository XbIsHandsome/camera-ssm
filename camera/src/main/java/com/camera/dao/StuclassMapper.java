package com.camera.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.camera.model.Stuclass;
import com.camera.model.SycrohProfile;

@Repository
public interface StuclassMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Stuclass record);

    int insertSelective(Stuclass record);

    Stuclass selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Stuclass record);

    int updateByPrimaryKey(Stuclass record);

	List<SycrohProfile> selectSycrohClass(Integer week, Integer currentTime);

	List<Integer> selectCurrentCourse(Integer countCurrentDayWeek, Integer countCurrentCourseTime);
	
	SycrohProfile selectOneClass(Integer countCurrentDayWeek, Integer countCurrentCourseTime, Integer cid);
	//SycrohProfile selectByCid(Integer cid);

}