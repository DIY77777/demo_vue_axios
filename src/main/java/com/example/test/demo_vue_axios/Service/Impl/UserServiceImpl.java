package com.example.test.demo_vue_axios.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.test.demo_vue_axios.Dao.UserMapper;
import com.example.test.demo_vue_axios.Model.User;
import com.example.test.demo_vue_axios.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService  {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectOne(User user) {
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.eq("username",user.getUsername());
        qw.eq("password",user.getPassword());
        return userMapper.selectOne(qw);
    }
}
