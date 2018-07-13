package com.camera.dao;

import org.springframework.stereotype.Repository;

import com.camera.model.Course;

/**
 * @author 许兵
 * @description 课程模块的DAO层
 * @date 2018年7月13日,下午1:24:15
 */
@Repository
public interface CourseMapper {
    int deleteByPrimaryKey(Integer csid);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer csid);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

	Integer isRepeatedByCoursename(String coursename);
	
	Integer isRepeatedByCoursenameAndCid(String coursename, Integer cid);

	Integer selectCsidByCoursename(String coursename);
}