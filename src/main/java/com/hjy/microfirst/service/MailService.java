package com.hjy.microfirst.service;


import java.util.Map;

/**
 * 描述信息：邮件服务
 *
 * @author hujieyun
 * since:2020/4/27 16:15
 */
public interface MailService {

    /**
     * @return
     * @Description 发送文本邮件
     * @Author hjy
     * @Date 2020/4/27 16:16
     * @Param
     */
    void sendSimpleEmail(String destination, String subject, String text);

    /**
     * @return
     * @Description 发送html邮件
     * @Author hjy
     * @Date 2020/4/27 17:17
     * @Param fileArr 附件
     */
    void sendHtmlEmail(String destination, String subject, String text, String[] fileArr) throws Exception;

    /**
     * @Description  发送模板邮件
     * @Author hjy
     * @Date 2020/4/27 18:12
     * @Param
     * @return
     */
    void sendTemplateEmail(String destination, String subject, Map<String, Object> paramMap, String template) throws Exception;

}
