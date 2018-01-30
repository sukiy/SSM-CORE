package com.ssm.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/26.
 */
public class Dept implements Serializable {

    private int dno;
    private String dname;

    //一个部门对应多个员工
    private List<Emp> emps=new ArrayList<Emp>();

    public Dept(int dno, String dname) {
        this.dno = dno;
        this.dname = dname;
    }

    public Dept() {
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }
}
