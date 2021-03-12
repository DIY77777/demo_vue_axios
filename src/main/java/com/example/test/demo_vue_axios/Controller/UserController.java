package com.example.test.demo_vue_axios.Controller;

import com.example.test.demo_vue_axios.Model.User;
import com.example.test.demo_vue_axios.Service.UserService;
import com.example.test.demo_vue_axios.Util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin
    @PostMapping("/login")
    public Result login(@RequestBody User user){
        return Result.ok(userService.selectOne(user));
    }

}
