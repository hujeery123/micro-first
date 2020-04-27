package com.hjy.microfirst.service.impl;

import com.hjy.microfirst.service.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * 描述信息：邮件服务实现
 *
 * @author hujieyun
 * since:2020/4/27 16:16
 */
@Service
public class MailServiceImpl implements MailService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${spring.mail.username}")
    private String from;

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendSimpleEmail(String destination, String subject, String text) {
        SimpleMailMessage smm = new SimpleMailMessage();
        smm.setTo(destination);
        smm.setSubject(subject);
        smm.setText(text);
        smm.setFrom(from);
        mailSender.send(smm);

        logger.info("发送简单邮件成功!,des={}", destination);
    }

    @Override
    public void sendHtmlEmail(String destination, String subject, String text, String[] fileArr) throws Exception {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
        messageHelper.setFrom(from);
        messageHelper.setTo(destination);
        messageHelper.setSubject(subject);
        // true 为 HTML 邮件
        messageHelper.setText(text, true);

        //附件
        if (fileArr != null && fileArr.length > 0) {
            for (String filePath : fileArr) {
                FileSystemResource fileResource = new FileSystemResource(new File(filePath));
                if (fileResource.exists()) {
                    String filename = fileResource.getFilename();
                    messageHelper.addAttachment(filename, fileResource);
                }
            }
        }

        mailSender.send(message);
        logger.info("发送html邮件成功! des={}", destination);

    }
}
