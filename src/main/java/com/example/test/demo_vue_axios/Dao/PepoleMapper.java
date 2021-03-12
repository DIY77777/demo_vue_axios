package com.example.test.demo_vue_axios.Dao;

import com.example.test.demo_vue_axios.Model.Pepole;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PepoleMapper {

    List<Pepole> getAll();
}
