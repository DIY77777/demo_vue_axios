package com.example.test.demo_vue_axios.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.test.demo_vue_axios.Dao.CategoryMapper;
import com.example.test.demo_vue_axios.Model.Category;
import com.example.test.demo_vue_axios.Service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
}
