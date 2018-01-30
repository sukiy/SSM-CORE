package com.ssm.dao;

import com.ssm.entity.Dept;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/1/30.
 */
public interface DeptDao {

    @Select("select * from dept")
    public List<Dept> findDeptList();
}
