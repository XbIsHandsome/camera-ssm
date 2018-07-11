package com.camera.dao;

import com.camera.model.Model;

public interface ModelMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Model record);

    int insertSelective(Model record);

    Model selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);
}