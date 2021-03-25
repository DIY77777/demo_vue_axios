package com.example.test.demo_vue_axios.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.test.demo_vue_axios.Model.Book;
import com.example.test.demo_vue_axios.Vo.BookCategory;

import java.util.List;

public interface BookService extends IService<Book> {
    List<BookCategory> getBookList();

    List<BookCategory> getBookListByInfo(String keyword);
}
