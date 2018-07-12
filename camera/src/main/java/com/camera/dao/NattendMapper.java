package com.camera.dao;

import org.springframework.stereotype.Repository;

import com.camera.model.Nattend;
@Repository
public interface NattendMapper {
    int deleteByPrimaryKey(Integer nid);

    int insert(Nattend record);

    int insertSelective(Nattend record);

    Nattend selectByPrimaryKey(Integer nid);

    int updateByPrimaryKeySelective(Nattend record);

    int updateByPrimaryKey(Nattend record);

	Integer selectIsLate(Integer countCurrentDayWeek, Integer countCurrentCourseTime, Integer sid, Integer weekday);
}