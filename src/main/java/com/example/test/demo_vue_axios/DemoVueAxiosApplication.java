package com.example.test.demo_vue_axios;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.test.demo_vue_axios.Dao")
@SpringBootApplication
public class DemoVueAxiosApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoVueAxiosApplication.class, args);
    }

}
