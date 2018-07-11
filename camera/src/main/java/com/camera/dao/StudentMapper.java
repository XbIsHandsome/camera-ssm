package com.camera.dao;

import java.util.List;

import com.camera.model.ClassDetail;
import com.camera.model.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

	List<ClassDetail> selectStudentByCid(Integer cid);
	
	List<Student> selectStudentModelByCid(Integer cid);
}