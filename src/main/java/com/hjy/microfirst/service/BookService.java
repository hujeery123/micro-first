package com.hjy.microfirst.service;

import com.github.pagehelper.PageInfo;
import com.hjy.microfirst.domain.Book;

import java.util.Map;

/**
 * 描述信息：书籍服务类
 *
 * @author hujieyun
 * since:2020/4/26 18:06
 */
public interface BookService {

    /** 添加书籍
     * @Description
     * @Author hjy
     * @Date 2020/4/26 18:07
     * @Param
     * @return
     */
    public int addBook(Book book);

    /**
     * @Description  分页查询列表
     * @Author hjy
     * @Date 2020/4/26 20:06
     * @Param
     * @return
     */
    public PageInfo<Book> selectAllByParams(Map param);



}
