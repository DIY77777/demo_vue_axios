package com.example.test.demo_vue_axios.Controller;

import com.example.test.demo_vue_axios.Service.BookService;
import com.example.test.demo_vue_axios.Vo.BookCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LibraryController {

    @Autowired
    BookService bookService;

    @CrossOrigin
    @GetMapping("/bookList")
    public List<BookCategory> list() throws Exception{
        return bookService.getBookList();
    }

    @CrossOrigin
    @GetMapping("/seach")
    public List<BookCategory> listByMes(@RequestParam("keyword") String keyword) throws Exception{
        return bookService.getBookListByInfo(keyword);
    }

}
