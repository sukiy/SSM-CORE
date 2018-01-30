package com.mybatis;

import com.mybatis.dao.StudentDao;
import com.mybatis.dao.impl.StudentDaoImpl;
import com.mybatis.entity.Student;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/25.
 */
public class StudentTest extends TestCase {

    private StudentDao stuDao=new StudentDaoImpl();
    public void test_methods(){
        stuDao.findStuList();
        System.out.println("---------------");
        //stuDao.getStudentById(1);
        Map map=new HashMap();
        //map.put("sex","男");
        //stuDao.findStuList_2(map);

        //map.put("name","i");
        //stuDao.findStuList_3(map);

        //map.put("age1",23);
        //map.put("age2",24);
        //stuDao.findStuList_4(map);

        //Student stu=new Student(1,"管理员",25,"女");
        //stuDao.updateStudent(stu);

        //int[] ids={1,3,5};
        //stuDao.findStuList_5(ids);

        //Student stu=new Student(0,"小琳",25,"女");
        //stuDao.addStudent(stu);

        Student stu=new Student(0,"小芳",22,"女");
        //stuDao.addStudent(stu);
        stuDao.addStudent_2(stu);
    }
}
