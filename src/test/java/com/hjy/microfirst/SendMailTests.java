package com.hjy.microfirst;

import com.hjy.microfirst.service.MailService;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 描述信息：
 *
 * @author hujieyun
 * since:2020/4/27 16:26
 */
@SpringBootTest
class SendMailTests {

    @Autowired
    private MailService mailService;

    @Test
    @Ignore
    void sendMail() {
        String to = "925789661@qq.com";
        String text = "<p>我的第一封测试邮件</p>";
        String subject = "测试邮件";
        mailService.sendSimpleEmail(to, subject, text);
    }

    @Test
    void sendHtmlMail() {
        String to = "925789661@qq.com";
        String subject = "Springboot 发送 HTML 邮件";
        String content = "<h2>Hi~</h2><p>第一封 Springboot HTML 邮件</p>";
        String filePath = "pom.xml";
        try {
            mailService.sendHtmlEmail(to, subject, content, new String[]{filePath});
        } catch (Exception e) {
            System.out.println("发送html邮件失败");
        }
    }
}
