package com.mybatis.dao.impl;

import com.mybatis.dao.StudentDao;
import com.mybatis.entity.Student;
import com.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2018/1/25.
 */
public class StudentDaoImpl implements StudentDao {

    @Override
    public boolean addStudent(Student stu) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            session.getMapper(StudentDao.class).addStudent(stu);
            session.commit();
            System.out.println("添加学生成功");
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return false;
    }

    @Override
    public List<Student> findStuList() {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            List<Student> students=session.getMapper(StudentDao.class).findStuList();
            for(Student stu:students){
                System.out.println(stu.getSno()+","+stu.getSname()+","+stu.getSage());
            }
            return students;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    @Override
    public Student getStuById(int id) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            Student stu=session.getMapper(StudentDao.class).getStuById(id);
            if(stu==null)
                return null;
            System.out.print(stu.getSno()+","+stu.getSname()+","+stu.getSage());
            if(stu.getCard()!=null){
                System.out.println(","+stu.getCard().getCnum());
            }else{
                System.out.println(",学号尚未分配");
            }
            return stu;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
}
