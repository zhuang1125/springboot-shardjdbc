package com.shardding.springboot.shardjdbc.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shardding.springboot.shardjdbc.entity.Book;
import com.shardding.springboot.shardjdbc.mapper.BookMapper;
import com.shardding.springboot.shardjdbc.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wangfeng
 * @date 2020/6/16 15:20
 * @creed: Talk is cheap,show me the code
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

    @Override
    public List<Book> getBookList() {
        return baseMapper.selectList(Wrappers.<Book>lambdaQuery());
    }


    @Override
    public boolean save(Book book) {
        return super.save(book);
    }
}