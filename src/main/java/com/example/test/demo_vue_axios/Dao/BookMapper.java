package com.example.test.demo_vue_axios.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.test.demo_vue_axios.Model.Book;
import com.example.test.demo_vue_axios.Vo.BookCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper extends BaseMapper<Book> {

    List<BookCategory> getBookList();

    List<BookCategory> getBookListByInfo(@Param("info") String keyword);
}
