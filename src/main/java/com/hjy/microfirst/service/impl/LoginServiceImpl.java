package com.hjy.microfirst.service.impl;

import com.hjy.microfirst.domain.User;
import com.hjy.microfirst.domain.mapper.UserMapper;
import com.hjy.microfirst.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 描述信息：用户信息服务
 *
 * @author hujieyun
 * since:2020/5/7 20:15
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> login(Map param) {
        return userMapper.selectByParam(param);
    }
}
