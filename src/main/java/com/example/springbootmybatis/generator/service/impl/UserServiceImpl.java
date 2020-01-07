package com.example.springbootmybatis.generator.service.impl;

import com.example.springbootmybatis.generator.dao.UserMapper;
import com.example.springbootmybatis.generator.entity.User;
import com.example.springbootmybatis.generator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author suwua.
 * @date 2020/1/6
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);

    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }
}
