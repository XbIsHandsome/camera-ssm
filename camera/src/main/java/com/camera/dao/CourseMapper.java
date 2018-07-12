package com.camera.dao;

import org.springframework.stereotype.Repository;

import com.camera.model.Course;
@Repository
public interface CourseMapper {
    int deleteByPrimaryKey(Integer csid);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer csid);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}