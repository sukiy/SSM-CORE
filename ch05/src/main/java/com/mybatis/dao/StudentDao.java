package com.mybatis.dao;

import com.mybatis.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/25.
 */
public interface StudentDao {

    @Insert("insert into student(sname,sage,ssex) values(#{sname},#{sage},#{ssex})")
    public boolean addStudent(Student stu);

    @Select("select * from student where sno=#{id}")
    public Student getStuById(int id);

    @Update("update student set sname=#{sname},sage=#{sage},ssex=#{ssex} where sno=#{sno}")
    public boolean updateStudent(Student stu);

    @Delete("delete from student where sno=#{id}")
    public boolean deleteStudentById(int id);

    @Results({
            @Result(property = "sno",column = "sno",id = true),
            @Result(property = "sname",column = "sname"),
            @Result(property = "sage",column = "sage"),
            @Result(property = "ssex",column = "ssex")
    })
    @Select("select * from student")
    public List<Student> findStuList();

    //根据姓名进行模糊查询
    @Select("select * from student where sname like #{name}")
    public List<Student> findStuByName(String name);

    @Select("select * from student where sage>=#{age1} and sage<=#{age2}")
    public List<Student> findStuByAge(@Param("age1") int age1,@Param("age2") int age2);

    //查询出不同性别的人数并按照人数倒序
    @Select("select ssex,count(*) as scount from student group by ssex order by scount desc ")
    public List<Map<String,Object>> findStudentSexInfo();
}




