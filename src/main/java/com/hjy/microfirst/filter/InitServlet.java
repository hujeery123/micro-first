package com.hjy.microfirst.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 描述信息：自定义servlet
 *
 * @author hujieyun
 * since:2020/4/25 20:21
 */

@WebServlet(urlPatterns = "/initServlet", loadOnStartup = 1)
public class InitServlet extends HttpServlet {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void init() throws ServletException {
        logger.info("initServet初始化");
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
