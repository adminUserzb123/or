package com.adc.springcloud.dao;

import com.adc.springcloud.entities.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DeptDao
{
	public boolean addDept(Dept dept);

	public Dept findById(String id);

	public List<Dept> findAll();
}
