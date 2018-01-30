package com.ssm.dao;

import com.ssm.entity.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/1/30.
 */
public interface EmpDao {

    @Insert("insert into emp(ename,eage,edno) values(#{ename},#{eage},#{dept.dno})")
    public boolean addEmp(Emp emp);

    @Select("select * from emp e left join dept d on e.edno=d.dno order by d.dno")
    @ResultMap("com.ssm.dao.EmpDao.empMap")
    public List<Emp> findEmpList();
}
