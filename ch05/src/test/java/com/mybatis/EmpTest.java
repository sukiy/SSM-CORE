package com.mybatis;

import com.mybatis.dao.EmpDao;
import com.mybatis.dao.impl.EmpDaoImpl;
import com.mybatis.entity.Emp;
import junit.framework.TestCase;

/**
 * Created by Administrator on 2018/1/29.
 */
public class EmpTest extends TestCase {

    private EmpDao empDao=new EmpDaoImpl();
    public void test_method(){
        Emp emp=new Emp(0,"xiaoliu",23);
        //Dept dept=new Dept(1,null);
        //emp.setDept(dept);
        //empDao.addEmp(emp);
        //System.out.println("-----------");
        empDao.findEmpList();
        System.out.println("-----------");
        empDao.findEmpListInfo();
    }
}
