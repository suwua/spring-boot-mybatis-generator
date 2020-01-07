package com.example.springbootmybatis.generator.controller;

import com.example.springbootmybatis.generator.entity.User;
import com.example.springbootmybatis.generator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author suwua.
 * @date 2020/1/6
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<User> selectAll(){
        return userService.selectAll();
    }


}
