package com.mybatis.dao;

import com.mybatis.entity.Student;

import java.util.List;

/**
 * Created by Administrator on 2018/1/16.
 */
public interface StudentDao {

    //添加学生
    public boolean addStudent(Student stu);

    //更新学生
    public boolean updateStudent(Student stu);

    //根据Id查询单个学生
    public Student getStudentById(int id);

    //查询所有学生
    public List<Student> findStuList();

    //根据学生姓名模糊查询所有学生
    public List<Student> findStuByName(String name);

    //根据学生年龄范围查询所有学生
    public List<Student> findStuByAge(int age1,int age2);

    //查询学生人数的方法
    public int getStudentCount();

    //查询所有学生信息并根据年龄倒序显示
    public List<Student> findOrderStuList();

    //查询不同性别学生的人数
    public List getStuCountBySex();

}
