package com.ssm.services;

import com.ssm.entity.Dept;

import java.util.List;

/**
 * Created by Administrator on 2018/1/30.
 */
public interface DeptService {

    //查询所有部门
    public List<Dept> findDeptList();
}
