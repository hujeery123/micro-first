package com.hjy.microfirst.controller;

import com.hjy.microfirst.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述信息：
 *
 * @author hujieyun
 * since:2020/4/25 12:53
 */
@RestController
public class ExamController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Person person;

    @RequestMapping
    public String hello(){
        logger.info("获取配置信息person:{}", person.getName());
        return "hello";
    }

}
