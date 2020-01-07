package com.example.springbootmybatis.generator.dao;

import com.example.springbootmybatis.generator.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);
    @Select("select id,username,password,enable from user")
    List<User> selectAll();

    int updateByPrimaryKey(User record);
}