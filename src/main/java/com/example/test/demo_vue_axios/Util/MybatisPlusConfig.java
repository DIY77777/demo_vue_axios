package com.example.test.demo_vue_axios.Util;

import com.baomidou.mybatisplus.annotation.DbType;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
public class MybatisPlusConfig {
    /**
     * mybatis plus分页插件配置
     * @return
     */
    @Bean
    public MybatisPlusInterceptor paginationInterceptor() {
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor();
        paginationInnerInterceptor.setDbType(DbType.MYSQL);
        List<InnerInterceptor> innerInterceptors = new ArrayList<>();
        innerInterceptors.add(paginationInnerInterceptor);
        mybatisPlusInterceptor.setInterceptors(innerInterceptors);
        return mybatisPlusInterceptor;
    }
}
