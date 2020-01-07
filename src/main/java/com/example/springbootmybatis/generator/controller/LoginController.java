package com.example.springbootmybatis.generator.controller;

import com.example.springbootmybatis.generator.entity.User;
import com.example.springbootmybatis.generator.util.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 登录Controller
 */
@Slf4j
@RestController
public class LoginController {

    static Map<Integer, User> userMap = new HashMap<>();

    static {
        //模拟数据库
        User user1 = new User(1, "zhangsan", "张三", "123456");
        userMap.put(1, user1);
        User user2 = new User(2, "lisi", "李四", "123123");
        userMap.put(2, user2);
    }

    /**
     * 模拟用户 登录
     */
    @RequestMapping("/login")
    public String login(User user) {
        for (User dbUser : userMap.values()) {
            if (dbUser.getUsername().equals(user.getUsername()) && dbUser.getPassword().equals(user.getPassword())) {
                log.info("登录成功！生成token！");
                String token = JwtUtil.createToken(dbUser);
                return token;
            }
        }
        return "";
    }
}