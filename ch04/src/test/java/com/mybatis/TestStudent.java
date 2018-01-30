package com.mybatis;

import com.mybatis.dao.*;
import com.mybatis.dao.impl.*;
import com.mybatis.entity.Dept;
import com.mybatis.entity.Orders;
import com.mybatis.entity.Student;
import junit.framework.TestCase;

import java.util.Date;

/**
 * Created by Administrator on 2018/1/26.
 */
public class TestStudent extends TestCase {

    private StudentDao stuDao=new StudentDaoImpl();
    private Student_CardDao cardDao=new Student_CardDaoImpl();
    private DeptDao deptDao=new DeptDaoImpl();
    private EmpDao empDao=new EmpDaoImpl();
    private OrdersDao ordersDao=new OrdersDaoImpl();

    public void test_methods(){
        Student stu=new Student(5,"小强",23);
        //stuDao.addStudent(stu);
        System.out.println("------------");
        //stuDao.findStuList();

        //stuDao.getStuById(1);
        //System.out.println("------------");
        //stuDao.getStuById(5);

        //Student_Card card=new Student_Card(0,"10005");
        //card.setStudent(stu);
        //cardDao.addStudent_Card(card);

        //cardDao.findStuCard();

        //deptDao.findDeptList();
        //System.out.println("====================");
        Dept dept=new Dept(0,"后勤部");
        //deptDao.addDept(dept);
        //deptDao.findDeptList();

        //Emp emp=new Emp(0,"小杰",20);
        //dept=new Dept(3,"后勤部");
        //emp.setDept(dept);
        //empDao.addEmp(emp);
        //empDao.findEmpList();

        ordersDao.findOrdersList();
        System.out.println("--------------------------");
        Orders orders=new Orders(0,"小明订单",new Date());
        //ordersDao.addOrder(orders);
        //ordersDao.findOrdersList();

        ordersDao.addOrderInfo(3,1);
        ordersDao.addOrderInfo(3,2);
        ordersDao.findOrdersList();

    }
}
