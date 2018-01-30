package com.ssm.dao;

import com.ssm.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/1/30.
 */
public interface StuDao {

    @Insert("insert into student(sname,sage,ssex) values(#{sname},#{sage},#{ssex})")
    public boolean addStudent(Student stu);

    @Select("select * from student")
    public List<Student> findStuList();
}
