package com.camera.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.camera.model.ClassCourse;
import com.camera.model.CourseProfile;
import com.camera.model.HistoryProfile;

/**
 * @author 许兵
 * @description 班级课程的DAO层
 * @date 2018年7月13日,下午1:23:46
 */
@Repository
public interface ClassCourseMapper {
    int deleteByPrimaryKey(Integer ccid);

    int insert(ClassCourse record);

    int insertSelective(ClassCourse record);

    ClassCourse selectByPrimaryKey(Integer ccid);

    int updateByPrimaryKeySelective(ClassCourse record);

    int updateByPrimaryKey(ClassCourse record);
    
    List<ClassCourse> listall();

	List<HistoryProfile> selectByWeekAndDayOfWeek(Integer weektime, Integer weekday, Integer time);

	List<CourseProfile> showAllCourse();
}