package com.adc.springcloud.service;

import com.adc.springcloud.dao.DeptDao;
import com.adc.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {
    @Autowired
    private DeptDao dao;

    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }


    public Dept get(String id) {
        return dao.findById(id);
    }

    public List<Dept> list() {
        return dao.findAll();
    }

}
