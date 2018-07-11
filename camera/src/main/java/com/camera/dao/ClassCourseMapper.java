package com.camera.dao;

import java.util.List;

import com.camera.model.ClassCourse;

public interface ClassCourseMapper {
    int deleteByPrimaryKey(Integer ccid);

    int insert(ClassCourse record);

    int insertSelective(ClassCourse record);

    ClassCourse selectByPrimaryKey(Integer ccid);

    int updateByPrimaryKeySelective(ClassCourse record);

    int updateByPrimaryKey(ClassCourse record);
    
    List<ClassCourse> listall();
}