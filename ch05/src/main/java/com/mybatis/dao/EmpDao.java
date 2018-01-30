package com.mybatis.dao;

import com.mybatis.entity.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/1/26.
 */
public interface EmpDao {

    //添加员工
    @Insert("insert into emp(ename,eage,edno) values(#{ename},#{eage},#{dept.dno})")
    public boolean addEmp(Emp emp);

    //查询所有员工基本信息
    @Select("select * from emp")
    public List<Emp> findEmpList();

    @Select("select * from emp e,dept d where e.edno=d.dno")
    @ResultMap("com.mybatis.dao.EmpDao.empMap")
    public List<Emp> findEmpListInfo();

}
