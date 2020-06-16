package com.shardding.springboot.shardjdbc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shardding.springboot.shardjdbc.entity.Book;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wangfeng
 * @date 2020/6/16 15:20
 * @creed: Talk is cheap,show me the code
 */
@Repository
public interface BookService extends IService<Book> {

    List<Book> getBookList();

     boolean save(Book book);
}
