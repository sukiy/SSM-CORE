package com.mybatis;

import com.mybatis.dao.StudentDao;
import com.mybatis.dao.impl.StudentDaoImpl;
import junit.framework.TestCase;

/**
 * Created by Administrator on 2018/1/16.
 */
public class StuTest extends TestCase {

    private StudentDao dao=new StudentDaoImpl();
    public void test_Method(){
        dao.findStuList();
        System.out.println("---------------------");
        //dao.findOrderStuList();
        dao.getStuCountBySex();
        //dao.getStudentCount();
        //dao.findStuByName("o");
        //dao.findStuByAge(21,26);
        //dao.getStudentById(2);

        /*
        dao.addStudent(new Student(0,"Jack",23,"男"));
        dao.addStudent(new Student(0,"Lucy",21,"女"));
        dao.addStudent(new Student(0,"Join",26,"男"));
        dao.addStudent(new Student(0,"Toms",20,"男"));
        dao.addStudent(new Student(0,"LiLy",21,"女"));
        */
    }
}
