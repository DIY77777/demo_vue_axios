package com.example.test.demo_vue_axios.Service.Impl;

import com.example.test.demo_vue_axios.Dao.UserMapper;
import com.example.test.demo_vue_axios.Model.User;
import com.example.test.demo_vue_axios.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User selectOne(User user) {
        return userMapper.selectOne(user);
    }
}
