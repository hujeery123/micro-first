package com.hjy.microfirst.controller;

import com.hjy.microfirst.entity.ResultMap;
import org.apache.shiro.authc.AccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 描述信息：
 *
 * @author hujieyun
 * since:2020/5/7 18:52
 */
@RestControllerAdvice
public class ExceptionController {

    // 捕捉 CustomRealm 抛出的异常
    @ExceptionHandler(AccountException.class)
    public ResultMap handleShiroException(Exception ex) {
        ResultMap resultMap = new ResultMap();
        return resultMap.fail().message(ex.getMessage());
    }
}
