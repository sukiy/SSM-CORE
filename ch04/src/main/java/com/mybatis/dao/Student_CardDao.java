package com.mybatis.dao;

import com.mybatis.entity.Student_Card;

import java.util.List;

/**
 * Created by Administrator on 2018/1/26.
 */
public interface Student_CardDao {

    public boolean addStudent_Card(Student_Card card);

    public List<Student_Card> findStuCard();
}
