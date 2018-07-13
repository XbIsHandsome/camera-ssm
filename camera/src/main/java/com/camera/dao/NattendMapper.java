package com.camera.dao;

import org.springframework.stereotype.Repository;

import com.camera.model.Nattend;


/**
 * @author 许兵
 * @description 迟到学生的记录的DAO层
 * @date 2018年7月13日,下午1:25:24
 */
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