package com.mybatis.dao;

import com.mybatis.entity.Emp;

import java.util.List;

/**
 * Created by Administrator on 2018/1/26.
 */
public interface EmpDao {

    //添加员工
    public boolean addEmp(Emp emp);

    //查询所有员工详情
    public List<Emp> findEmpList();
}
