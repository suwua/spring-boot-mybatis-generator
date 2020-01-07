package com.example.springbootmybatis.generator.dao;

import com.example.springbootmybatis.generator.entity.UserRole;
import java.util.List;

public interface UserRoleMapper {
    int insert(UserRole record);

    List<UserRole> selectAll();
}