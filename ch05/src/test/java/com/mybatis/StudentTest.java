package com.mybatis;

import com.mybatis.dao.StudentDao;
import com.mybatis.dao.impl.StudentDaoImpl;
import com.mybatis.entity.Student;
import junit.framework.TestCase;

/**
 * Created by Administrator on 2018/1/29.
 */
public class StudentTest extends TestCase {

    private StudentDao stuDao=new StudentDaoImpl();
    public void test_method(){
        Student stu=new Student(0,"Join",21,"女");
        //stuDao.addStudent(stu);

        //stuDao.getStuById(4);
        //stu.setSno(4);
        //stu.setSname("xiaoqing");
        //stuDao.updateStudent(stu);
        //stuDao.getStuById(4);

        //stuDao.deleteStudentById(4);

        //stuDao.findStuList();
        //System.out.println("---------------------");
        //stuDao.findStuByName("%o%");
        //stuDao.findStuByAge(22,25);
        //stuDao.findStudentSexInfo();
    }
}
