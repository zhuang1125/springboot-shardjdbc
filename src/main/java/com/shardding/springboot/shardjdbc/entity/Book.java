package com.shardding.springboot.shardjdbc.entity;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author Wangfeng
 * @date 2020/6/16 15:18
 * @creed: Talk is cheap,show me the code
 */
@TableName("book")
public class Book {

    private int id;
    private int count;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", count=" + count +
                ", name='" + name + '\'' +
                '}';
    }
}
