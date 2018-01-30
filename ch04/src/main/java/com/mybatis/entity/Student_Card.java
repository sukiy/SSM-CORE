package com.mybatis.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/26.
 */
public class Student_Card implements Serializable {

    private int cno;
    private String cnum;//学号

    //一个学号对应一个学生
    private Student student;

    public Student_Card(int cno, String cnum) {
        this.cno = cno;
        this.cnum = cnum;
    }

    public Student_Card() {
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getCnum() {
        return cnum;
    }

    public void setCnum(String cnum) {
        this.cnum = cnum;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
