package com.camera.dao;

import org.springframework.stereotype.Repository;

import com.camera.model.User;


/**
 * @author 许兵
 * @description 用户的DAO层
 * @date 2018年7月13日,下午1:26:27
 */
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