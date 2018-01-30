package com.mybatis.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/16.
 */
public class Student implements Serializable{

    private int stuno;
    private String stuname;
    private int stuage;
    private String stusex;

    public Student() {
    }

    public Student(int stuno, String stuname, int stuage, String stusex) {
        this.stuno = stuno;
        this.stuname = stuname;
        this.stuage = stuage;
        this.stusex = stusex;
    }

    public int getStuno() {
        return stuno;
    }

    public void setStuno(int stuno) {
        this.stuno = stuno;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public int getStuage() {
        return stuage;
    }

    public void setStuage(int stuage) {
        this.stuage = stuage;
    }

    public String getStusex() {
        return stusex;
    }

    public void setStusex(String stusex) {
        this.stusex = stusex;
    }
}
