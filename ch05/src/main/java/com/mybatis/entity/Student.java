package com.mybatis.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/16.
 */
public class Student implements Serializable{

    private int sno;
    private String sname;
    private int sage;
    private String ssex;

    public Student() {
    }

    public Student(int sno, String sname, int sage, String ssex) {
        this.sno = sno;
        this.sname = sname;
        this.sage = sage;
        this.ssex = ssex;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }
}
