package com.hjy.microfirst.service.impl;

import com.hjy.microfirst.domain.Book;
import com.hjy.microfirst.domain.mapper.BookMapper;
import com.hjy.microfirst.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述信息：书籍业务实现类
 *
 * @author hujieyun
 * since:2020/4/26 18:06
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public int addBook(Book book) {
       return bookMapper.insert(book);
    }
}
