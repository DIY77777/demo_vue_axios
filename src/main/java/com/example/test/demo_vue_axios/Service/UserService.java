package com.example.test.demo_vue_axios.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.test.demo_vue_axios.Model.User;

public interface UserService extends IService<User> {
    User selectOne(User user);
}
