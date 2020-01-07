package com.example.springbootmybatis.generator.service;

/**
 * @author suwua.
 * @date 2020/1/6
 */
public interface MailService {
    void sendSimpleMail(String mailTo);

    void sendMail(String mailTo);

}
