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
            System.out.println("添加员工成功");
            session.commit();
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
            List<Emp> list=session.getMapper(EmpDao.class).findEmpList();
            for (Emp emp:list){
                System.out.println(emp.getEno()+","+emp.getEname()+","+emp.getEage());
            }
            return list;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    @Override
    public List<Emp> findEmpListInfo() {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            List<Emp> list=session.getMapper(EmpDao.class).findEmpListInfo();
            for (Emp emp:list){
                System.out.print(emp.getEno()+","+emp.getEname()+","+emp.getEage());
                if(emp.getDept()!=null){
                    System.out.println(","+emp.getDept().getDname());
                }else{
                    System.out.println(",尚未分配");
                }
            }
            return list;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
}
