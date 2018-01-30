package com.mybatis.dao.impl;

import com.mybatis.dao.StudentDao;
import com.mybatis.entity.Student;
import com.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2018/1/15.
 */
public class StudentDaoImpl implements StudentDao {

    @Override
    public boolean addStudent(Student stu) {
        //获取Session
        SqlSession session= MybatisUtil.getSqlSession();
        session.getMapper(StudentDao.class).addStudent(stu);
        session.commit();
        session.close();
        return true;
    }

    @Override
    public Student getStudentById(int id) {
        SqlSession session=MybatisUtil.getSqlSession();
        Student stu=session.getMapper(StudentDao.class).getStudentById(id);
        session.close();
        System.out.println(stu.getSno()+","+stu.getSname());
        return stu;
    }

    @Override
    public boolean updateStudent(Student stu) {
        SqlSession session= MybatisUtil.getSqlSession();
        session.getMapper(StudentDao.class).updateStudent(stu);
        session.commit();
        session.close();
        return true;
    }

    @Override
    public boolean deleteStudent(int id) {
        SqlSession session= MybatisUtil.getSqlSession();
        session.getMapper(StudentDao.class).deleteStudent(id);
        session.commit();
        session.close();
        return true;
    }

    @Override
    public List<Student> findStuList() {
        SqlSession session= MybatisUtil.getSqlSession();
        List<Student> list=session.getMapper(StudentDao.class).findStuList();
        session.close();
        for(Student stu:list){
            System.out.println(stu.getSno()+","+stu.getSname());
        }
        return list;
    }

    public static void main(String[] args) {
        StudentDao dao=new StudentDaoImpl();
        dao.addStudent(new Student(0,"Lucy",23,"女"));
    }
}
