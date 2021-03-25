package com.example.test.demo_vue_axios.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.test.demo_vue_axios.Dao.BookMapper;
import com.example.test.demo_vue_axios.Model.Book;
import com.example.test.demo_vue_axios.Service.BookService;
import com.example.test.demo_vue_axios.Vo.BookCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<BookCategory> getBookList() {
        return bookMapper.getBookList();
    }

    @Override
    public List<BookCategory> getBookListByInfo(String keyword) {
        return bookMapper.getBookListByInfo(keyword);
    }
}
