package com.example.springbootmybatis.generator.controller;

import com.example.springbootmybatis.generator.service.SmsService;
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
@RequestMapping("/sms")
public class SmsController {

    @Autowired
    private SmsService smsService;

    @RequestMapping(value = "/send",method = RequestMethod.GET)
    public String sendSms(@RequestParam(value = "userName")String userName){
        smsService.sendSms(userName);
        return "success";
    }
}
