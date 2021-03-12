package com.example.test.demo_vue_axios.Controller;

import com.example.test.demo_vue_axios.Model.Pepole;
import com.example.test.demo_vue_axios.Service.PepoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testConreoller {

    @Autowired
    private PepoleService pepoleService;

    @GetMapping("/getAll")
    @CrossOrigin
    public List<Pepole> getAll(){
        return pepoleService.getAll();
    }


}
