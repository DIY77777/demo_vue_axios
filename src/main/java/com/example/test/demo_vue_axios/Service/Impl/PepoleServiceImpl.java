package com.example.test.demo_vue_axios.Service.Impl;

import com.example.test.demo_vue_axios.Dao.PepoleMapper;
import com.example.test.demo_vue_axios.Model.Pepole;
import com.example.test.demo_vue_axios.Service.PepoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PepoleServiceImpl implements PepoleService {

    @Autowired
    private PepoleMapper pepoleMapper;

    @Override
    public List<Pepole> getAll() {
        return pepoleMapper.getAll();
    }
}
