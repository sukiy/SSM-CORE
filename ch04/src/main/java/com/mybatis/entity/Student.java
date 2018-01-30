package com.mybatis.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/16.
 */
public class Student implements Serializable{

    private int sno;
    private String sname;
    private int sage;

    //一个学生有一个学号
    private Student_Card card;

    public Student() {
    }

    public Student(int sno, String sname, int sage) {
        this.sno = sno;
        this.sname = sname;
        this.sage = sage;
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

    public Student_Card getCard() {
        return card;
    }

    public void setCard(Student_Card card) {
        this.card = card;
    }
}
