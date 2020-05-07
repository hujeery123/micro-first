package com.hjy.microfirst.service;

import com.hjy.microfirst.domain.User;

import java.util.List;
import java.util.Map;

/**
 * 描述信息：登录服务类
 *
 * @author hujieyun
 * since:2020/5/7 20:13
 */
public interface LoginService {

    List<User> login(Map param);

}
