package com.example.springbootmybatis.generator.service;

import com.example.springbootmybatis.generator.entity.User;

import java.util.List;

/**
 * @author suwua.
 * @date 2020/1/6
 */
public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}
