package com.camera.dao;

import org.springframework.stereotype.Repository;

import com.camera.model.User;
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	User selectByNameAndPass(String userName, String userPass);
}