package com.shardding.springboot.shardjdbc.controller;

import com.shardding.springboot.shardjdbc.entity.Book;
import com.shardding.springboot.shardjdbc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Wangfeng
 * @date 2020/6/16 15:19
 * @creed: Talk is cheap,show me the code
 */
@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public List<Book> getItems(){
        return bookService.getBookList();
    }

    @RequestMapping(value = "/book",method = RequestMethod.POST)
    public Boolean saveItem(Book book){
        return bookService.save(book);
    }

}
