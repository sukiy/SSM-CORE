package com.mybatis.dao.impl;

import com.mybatis.dao.EmpDao;
import com.mybatis.entity.Emp;
import com.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2018/1/26.
 */
public class EmpDaoImpl implements EmpDao {
    @Override
    public boolean addEmp(Emp emp) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            session.getMapper(EmpDao.class).addEmp(emp);
            session.commit();
            System.out.println("添加员工成功");
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return false;
    }

    @Override
    public List<Emp> findEmpList() {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            List<Emp> emps=session.getMapper(EmpDao.class).findEmpList();
            for (Emp emp:emps){
                System.out.print(emp.getEno()+","+emp.getEname()+","+emp.getEage());
                if(emp.getDept()!=null)
                    System.out.println(","+emp.getDept().getDname());
                else{
                    System.out.println(",尚未分配部门");
                }
            }
            return emps;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
}
