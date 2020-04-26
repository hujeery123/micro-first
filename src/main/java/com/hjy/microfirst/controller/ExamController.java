package com.hjy.microfirst.controller;

import com.github.pagehelper.PageInfo;
import com.hjy.microfirst.domain.Book;
import com.hjy.microfirst.entity.Person;
import com.hjy.microfirst.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * 描述信息：
 *
 * @author hujieyun
 * since:2020/4/25 12:53
 */
@RestController
public class ExamController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Person person;

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/hello")
    public String hello(){
        logger.info("获取配置信息person:{}", person.getName());
        PageInfo<Book> pageInfo = bookService.selectAllByParams(null);
        List<Book> bookList = pageInfo.getList();
        if (!CollectionUtils.isEmpty(bookList)) {
            for (Book book : bookList) {
                System.out.println(book.getName());
            }
        }
        return "hello";
    }

}
