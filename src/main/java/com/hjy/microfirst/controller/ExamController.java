package com.hjy.microfirst.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    @RequestMapping
    public String hello(){
        logger.info("测试hello");
        return "hello";
    }

}
