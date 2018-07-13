package com.camera.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.camera.model.ClassDetail;
import com.camera.model.Student;


/**
 * @author 许兵
 * @description 学生的DAO层
 * @date 2018年7月13日,下午1:26:00
 */
@Repository
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