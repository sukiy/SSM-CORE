package com.ssm.services;

import com.ssm.entity.Emp;

import java.util.List;

/**
 * Created by Administrator on 2018/1/30.
 */
public interface EmpService {

    public boolean addEmp(Emp emp);

    public List<Emp> findEmpList();
}






