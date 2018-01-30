package com.mybatis.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/26.
 */
public class Emp implements Serializable {

    private int eno;
    private String ename;
    private int eage;

    //一个员工属于一个部门(多对一)
    private Dept dept;

    public Emp(int eno, String ename, int eage) {
        this.eno = eno;
        this.ename = ename;
        this.eage = eage;
    }

    public Emp() {
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEage() {
        return eage;
    }

    public void setEage(int eage) {
        this.eage = eage;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
