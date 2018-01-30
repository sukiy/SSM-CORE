package com.mybatis.dao;

import com.mybatis.entity.Student;

import java.util.List;

/**
 * 操作学生的Dao接口
 * Created by Administrator on 2018/1/15.
 */
public interface StudentDao {

    public boolean addStudent(Student stu);

    public Student getStudentById(int id);

    public boolean updateStudent(Student stu);

    public boolean deleteStudent(int id);

    public List<Student> findStuList();
}
