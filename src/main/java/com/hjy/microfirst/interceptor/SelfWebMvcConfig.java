package com.hjy.microfirst.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 描述信息：自定义一些类
 *
 * @author hujieyun
 * since:2020/4/25 19:10
 */
@Configuration
public class SelfWebMvcConfig implements WebMvcConfigurer {

    /**
     * @Description  添加自定义拦截器
     * @Author hjy
     * @Date 2020/4/25 19:13
     * @Param
     * @return
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new PowerInterceptor()).addPathPatterns("/**");
    }
}
