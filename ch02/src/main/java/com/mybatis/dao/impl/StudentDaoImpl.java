package com.mybatis.dao.impl;

import com.mybatis.dao.StudentDao;
import com.mybatis.entity.Student;
import com.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/16.
 */
public class StudentDaoImpl implements StudentDao {

    @Override
    public boolean addStudent(Student stu) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            session.getMapper(StudentDao.class).addStudent(stu);
            session.commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            session.close();
        }
        return false;
    }

    @Override
    public boolean updateStudent(Student stu) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            session.getMapper(StudentDao.class).updateStudent(stu);
            session.commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            session.close();
        }
        return false;
    }

    @Override
    public Student getStudentById(int id) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            Student stu=session.getMapper(StudentDao.class).getStudentById(id);
            System.out.println(stu.getStuno()+","+stu.getStuname()+","+stu.getStusex());
            return stu;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            session.close();
        }
        return null;
    }

    @Override
    public List<Student> findStuList() {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            List<Student> stus=session.getMapper(StudentDao.class).findStuList();
            for(Student stu:stus){
                System.out.println(stu.getStuno()+","+stu.getStuname()+","+stu.getStusex()+","+stu.getStuage());
            }
            return stus;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            session.close();
        }
        return null;
    }

    @Override
    public List<Student> findStuByName(String name) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            List<Student> stus=session.getMapper(StudentDao.class).findStuByName(name);
            for(Student stu:stus){
                System.out.println(stu.getStuno()+","+stu.getStuname()+","+stu.getStusex()+","+stu.getStuage());
            }
            return stus;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            session.close();
        }
        return null;
    }

    @Override
    public List<Student> findStuByAge(int age1, int age2) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            List<Student> stus=session.getMapper(StudentDao.class).findStuByAge(age1,age2);
            for(Student stu:stus){
                System.out.println(stu.getStuno()+","+stu.getStuname()+","+stu.getStusex()+","+stu.getStuage());
            }
            return stus;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            session.close();
        }
        return null;
    }

    @Override
    public int getStudentCount() {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            int i=session.getMapper(StudentDao.class).getStudentCount();
            System.out.println("学生人数是:"+i);
            return i;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            session.close();
        }
        return 0;
    }

    @Override
    public List<Student> findOrderStuList() {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            List<Student> stus=session.getMapper(StudentDao.class).findOrderStuList();
            for(Student stu:stus){
                System.out.println(stu.getStuno()+","+stu.getStuname()+","+stu.getStusex()+","+stu.getStuage());
            }
            return stus;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            session.close();
        }
        return null;
    }

    @Override
    public List getStuCountBySex() {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            List<Map> list=session.getMapper(StudentDao.class).getStuCountBySex();
            System.out.println("list:"+list.size());
            for(Map map:list){
                System.out.println(map.get("ssex")+","+map.get("stucount"));
            }
            return list;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            session.close();
        }
        return null;
    }

    public static void main(String[] args) {
        StudentDao dao=new StudentDaoImpl();
        dao.getStuCountBySex();
    }
}
