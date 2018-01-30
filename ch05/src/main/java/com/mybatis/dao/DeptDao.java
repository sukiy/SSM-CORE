package com.mybatis.dao;

import com.mybatis.entity.Dept;

import java.util.List;

/**
 * Created by Administrator on 2018/1/26.
 */
public interface DeptDao {

    //添加部门
    public boolean addDept(Dept dept);

    //查询所有部门员工详情
    public List<Dept> findDeptList();
}
