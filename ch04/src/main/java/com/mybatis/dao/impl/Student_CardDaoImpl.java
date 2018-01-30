package com.mybatis.dao.impl;

import com.mybatis.dao.Student_CardDao;
import com.mybatis.entity.Student_Card;
import com.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2018/1/26.
 */
public class Student_CardDaoImpl implements Student_CardDao {
    @Override
    public boolean addStudent_Card(Student_Card card) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            session.getMapper(Student_CardDao.class).addStudent_Card(card);
            session.commit();
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return false;
    }

    @Override
    public List<Student_Card> findStuCard() {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            List<Student_Card> cards=session.getMapper(Student_CardDao.class).findStuCard();
            for(Student_Card card:cards){
                System.out.println(card.getCnum()+","+card.getStudent().getSname());
            }
            return cards;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
}
