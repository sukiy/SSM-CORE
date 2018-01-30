package com.mybatis.dao;

import com.mybatis.entity.Student;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/25.
 */
public interface StudentDao {

    public List<Student> findStuList();

    public Student getStudentById(int id);

    //根据性别查询
    public List<Student> findStuList_2(Map map);

    //根据姓名和性别查询
    public List<Student> findStuList_3(Map map);

    //如果有姓名，根据姓名查询，如果没有姓名，根据性别查询，如果没有性别，根据年龄查询
    public List<Student> findStuList_4(Map map);

    //更新需要更新的项
    public boolean updateStudent(Student stu);

    //查询id在指定范围的学生信息
    public List<Student> findStuList_5(int[] ids);

    public boolean addStudent(Student stu);

    public boolean addStudent_2(Student stu);
}




