package com.hjy.microfirst.controller;

import com.hjy.microfirst.entity.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述信息：用户处理
 *
 * @author hujieyun
 * since:2020/5/7 18:46
 */
//普通登陆用户
@RestController
@RequestMapping("/user")
public class UserController{
    @Autowired

    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public ResultMap getMessage() {
        ResultMap resultMap = new ResultMap();
        return resultMap.success().message("您拥有用户权限，可以获得该接口的信息！");
    }
}
