package com.mybatis.dao.impl;

import com.mybatis.dao.StudentDao;
import com.mybatis.entity.Student;
import com.mybatis.utils.MybatisUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/25.
 */
public class StudentDaoImpl implements StudentDao {

    @Override
    public boolean addStudent(Student stu) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            session.getMapper(StudentDao.class).addStudent(stu);
            System.out.println("添加学生成功");
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
    public List<Student> findStuList() {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            List<Student> stus=session.getMapper(StudentDao.class).findStuList();
            for(Student stu:stus){
                System.out.println(stu.getSno()+","+stu.getSname()+","+stu.getSsex()+","+stu.getSage());
            }
            return  stus;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
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
                System.out.println(stu.getSno()+","+stu.getSname()+","+stu.getSsex()+","+stu.getSage());
            }
            return  stus;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    @Override
    public List<Student> findStuByAge(@Param("age1") int age1, @Param("age2") int age2) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            List<Student> stus=session.getMapper(StudentDao.class).findStuByAge(age1,age2);
            for(Student stu:stus){
                System.out.println(stu.getSno()+","+stu.getSname()+","+stu.getSsex()+","+stu.getSage());
            }
            return  stus;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    @Override
    public List<Map<String, Object>> findStudentSexInfo() {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            List<Map<String,Object>> stus=session.getMapper(StudentDao.class).findStudentSexInfo();
            for(Map<String,Object> map:stus){
                System.out.println(map.get("ssex")+","+map.get("scount"));
            }
            return stus;
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
            System.out.println(stu.getSno()+","+stu.getSname()+","+stu.getSsex()+","+stu.getSage());
            return  stu;
        }catch (Exception ex){
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
            System.out.println("修改学生成功");
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
    public boolean deleteStudentById(int id) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            session.getMapper(StudentDao.class).deleteStudentById(id);
            System.out.println("删除学生成功");
            session.commit();
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return false;
    }
}
