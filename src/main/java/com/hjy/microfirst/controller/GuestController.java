package com.hjy.microfirst.controller;

import com.hjy.microfirst.entity.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 描述信息：
 *
 * @author hujieyun
 * since:2020/5/7 18:37
 */
@RestController
@RequestMapping("/guest")
public class GuestController{


    @RequestMapping(value = "/enter", method = RequestMethod.GET)
    public ResultMap login() {
        ResultMap resultMap = new ResultMap();
        return resultMap.success().message("欢迎进入，您的身份是游客");
    }

    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public ResultMap submitLogin() {
        ResultMap resultMap = new ResultMap();
        return resultMap.success().message("您拥有获得该接口的信息的权限！");
    }
}
