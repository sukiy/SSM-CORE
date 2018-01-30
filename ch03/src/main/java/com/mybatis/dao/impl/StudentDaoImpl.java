package com.mybatis.dao.impl;

import com.mybatis.dao.StudentDao;
import com.mybatis.entity.Student;
import com.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/25.
 */
public class StudentDaoImpl implements StudentDao {

    @Override
    public List<Student> findStuList() {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            List<Student> stus=session.getMapper(StudentDao.class).findStuList();
            for(Student stu:stus){
                System.out.println(stu.getStuno()+","+stu.getStuname()+","+stu.getStuage()+","+stu.getStusex());
            }
            return stus;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    @Override
    public Student getStudentById(int id) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            Student stu=session.getMapper(StudentDao.class).getStudentById(id);
            System.out.println(stu.getStuno()+","+stu.getStuname()+","+stu.getStuage()+","+stu.getStusex());
            return stu;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    @Override
    public List<Student> findStuList_2(Map map) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            List<Student> stus=session.getMapper(StudentDao.class).findStuList_2(map);
            for(Student stu:stus){
                System.out.println(stu.getStuno()+","+stu.getStuname()+","+stu.getStuage()+","+stu.getStusex());
            }
            return stus;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    @Override
    public List<Student> findStuList_3(Map map) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            List<Student> stus=session.getMapper(StudentDao.class).findStuList_3(map);
            for(Student stu:stus){
                System.out.println(stu.getStuno()+","+stu.getStuname()+","+stu.getStuage()+","+stu.getStusex());
            }
            return stus;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    public List<Student> findStuList_4(Map map) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            List<Student> stus=session.getMapper(StudentDao.class).findStuList_4(map);
            for(Student stu:stus){
                System.out.println(stu.getStuno()+","+stu.getStuname()+","+stu.getStuage()+","+stu.getStusex());
            }
            return stus;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return null;
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
        }finally {
            session.close();
        }
        return false;
    }

    @Override
    public List<Student> findStuList_5(int[] ids) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            List<Student> stus=session.getMapper(StudentDao.class).findStuList_5(ids);
            for(Student stu:stus){
                System.out.println(stu.getStuno()+","+stu.getStuname()+","+stu.getStuage()+","+stu.getStusex());
            }
            return stus;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    @Override
    public boolean addStudent(Student stu) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            session.getMapper(StudentDao.class).addStudent(stu);
            session.commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return false;
    }

    @Override
    public boolean addStudent_2(Student stu) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            session.getMapper(StudentDao.class).addStudent_2(stu);
            session.commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return false;
    }
}
