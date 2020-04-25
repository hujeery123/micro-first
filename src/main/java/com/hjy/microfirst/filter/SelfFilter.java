package com.hjy.microfirst.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 描述信息：自定义过滤器
 *
 * @author hujieyun
 * since:2020/4/25 20:22
 */
@WebFilter(urlPatterns = "/*")
public class SelfFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("自定义拦截器处理请求");
        filterChain.doFilter(servletRequest, servletResponse);
    }


}
