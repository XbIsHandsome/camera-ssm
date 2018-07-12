package com.camera.dao;

import org.springframework.stereotype.Repository;

import com.camera.model.Model;
@Repository
public interface ModelMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Model record);

    int insertSelective(Model record);

    Model selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);
}