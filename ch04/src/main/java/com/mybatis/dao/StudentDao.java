package com.mybatis.dao;

import com.mybatis.entity.Student;

import java.util.List;

/**
 * Created by Administrator on 2018/1/25.
 */
public interface StudentDao {

    public boolean addStudent(Student stu);

    //只查询所有学生信息
    public List<Student> findStuList();

    //查询指定Id的学生信息及学号
    public Student getStuById(int id);
}




