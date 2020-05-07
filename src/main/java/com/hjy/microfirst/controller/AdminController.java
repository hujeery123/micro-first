package com.hjy.microfirst.controller;

import com.hjy.microfirst.entity.ResultMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述信息：
 *
 * @author hujieyun
 * since:2020/5/7 18:50
 */
//管理员
@RestController
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public ResultMap getMessage() {
        ResultMap resultMap = new ResultMap();
        return resultMap.success().message("您拥有管理员权限，可以获得该接口的信息！");
    }
}
