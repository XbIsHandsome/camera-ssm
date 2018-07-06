package com.camera.dao;

import com.camera.model.Course;

public interface CourseMapper {
    int deleteByPrimaryKey(Integer csid);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer csid);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}