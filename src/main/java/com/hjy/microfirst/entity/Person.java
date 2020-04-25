package com.hjy.microfirst.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 描述信息：Person实体
 *
 * @author hujieyun
 * since:2020/4/25 18:30
 */
@Component
@ConfigurationProperties(prefix = "person")
@PropertySource("classpath:entity.properties")
public class Person {

    private String name;

    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
