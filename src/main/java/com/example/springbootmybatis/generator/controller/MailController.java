package com.example.springbootmybatis.generator.controller;

import com.example.springbootmybatis.generator.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suwua.
 * @date 2020/1/6
 */
@RestController
@RequestMapping("/mail")
public class MailController {
    @Autowired
    private MailService mailService;

    @RequestMapping(value = "/send",method = RequestMethod.GET)
    public String sendMail(@RequestParam(value = "userName")String userName){
        mailService.sendMail(userName);
        return "success";
    }
}