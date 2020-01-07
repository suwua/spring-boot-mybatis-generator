package com.example.springbootmybatis.generator.service.impl;

import com.example.springbootmybatis.generator.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @author suwua.
 * @date 2020/1/6
 */
@Service
@Slf4j
public class MailServiceImpl implements MailService {
    @Autowired
    private JavaMailSender mailSender;
    @Value("${mail.from}")
    private String mailFrom;
    @Override
    public void sendSimpleMail(String mailTo) {
        SimpleMailMessage message=new SimpleMailMessage();
        message.setFrom(mailFrom);
        message.setTo(mailTo);
        message.setSubject("simple mail");
        message.setText("hello world");
        mailSender.send(message);
        log.info("邮件已经发送");
    }

    @Override
    public void sendMail(String mailTo) {
        MimeMessage message=mailSender.createMimeMessage();
        MimeMessageHelper helper = null;
        try {
            helper = new MimeMessageHelper(message, true);
            helper.setFrom(mailFrom);
            helper.setTo(mailTo);
            helper.setSubject("simple mail");
            helper.setText("hello world", true);
            FileSystemResource file = new FileSystemResource(new File("G:\\temp\\集群系统说明.doc"));
            String fileName = file.getFilename();
            helper.addAttachment(fileName, file);
            mailSender.send(message);
            log.info("邮件已经发送");
        } catch (MessagingException e) {
            log.error("{}",e);
        }
    }

}