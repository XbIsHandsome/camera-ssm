package com.camera.dao;

import org.springframework.stereotype.Repository;

import com.camera.model.Model;


/**
 * @author 许兵
 * @description 学生人脸识别模型的DAO层
 * @date 2018年7月13日,下午1:24:46
 */
@Repository
public interface ModelMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Model record);

    int insertSelective(Model record);

    Model selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);
}