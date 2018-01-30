package com.mybatis.dao.impl;

import com.mybatis.dao.DeptDao;
import com.mybatis.entity.Dept;
import com.mybatis.entity.Emp;
import com.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2018/1/26.
 */
public class DeptDaoImpl implements DeptDao {

    @Override
    public boolean addDept(Dept dept) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            session.getMapper(DeptDao.class).addDept(dept);
            session.commit();
            System.out.println("添加部门成功");
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return false;
    }

    @Override
    public List<Dept> findDeptList() {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            List<Dept> depts=session.getMapper(DeptDao.class).findDeptList();
            for (Dept d:depts){
                System.out.println(d.getDno()+","+d.getDname());
                if(d.getEmps().size()>0){
                    for(Emp emp:d.getEmps()){
                        System.out.print(emp.getEname()+"   ");
                    }
                    System.out.println();
                }
                System.out.println("---------------------");
            }
            System.out.println("添加部门成功");
            return depts;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
}
