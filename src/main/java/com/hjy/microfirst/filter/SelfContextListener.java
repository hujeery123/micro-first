package com.hjy.microfirst.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 描述信息：自定义监听器
 *
 * @author hujieyun
 * since:2020/4/25 20:29
 */
@WebListener
public class SelfContextListener implements ServletContextListener {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("自定义监听器初始化");
    }
}
