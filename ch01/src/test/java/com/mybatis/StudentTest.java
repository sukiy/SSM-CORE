package com.mybatis;

import com.mybatis.dao.StudentDao;
import com.mybatis.dao.impl.StudentDaoImpl;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Administrator on 2018/1/15.
 */
public class StudentTest extends TestCase {

    private StudentDao stuDao=new StudentDaoImpl();
    @Test
    public void test_addStudent(){
        //Student stu=new Student(0,"Jack",23,"男");
        //stuDao.addStudent(stu);

        //Student stu=stuDao.getStudentById(2);
        //stu.setSname("阿里巴巴");
        //stuDao.updateStudent(stu);
        //stu=stuDao.getStudentById(2);

        //stuDao.deleteStudent(3);
        stuDao.findStuList();
    }
}
