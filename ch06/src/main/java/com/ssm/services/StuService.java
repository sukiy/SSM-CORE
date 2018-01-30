package com.ssm.services;

import com.ssm.entity.Student;

import java.util.List;

/**
 * Created by Administrator on 2018/1/30.
 */
public interface StuService {

    public boolean addStudent(Student stu);

    public List<Student> findStuList();
}
