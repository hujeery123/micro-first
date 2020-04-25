package com.hjy.microfirst.controller;

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

    @RequestMapping
    public String hello(){
        return "hello";
    }

}
