package com.shardding.springboot.shardjdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shardding.springboot.shardjdbc.entity.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Wangfeng
 * @date 2020/6/16 15:21
 * @creed: Talk is cheap,show me the code
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {
}