package com.mybatis.dao.impl;

import com.mybatis.dao.OrdersDao;
import com.mybatis.entity.Orders;
import com.mybatis.entity.Product;
import com.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2018/1/26.
 */
public class OrdersDaoImpl implements OrdersDao {
    @Override
    public boolean addOrder(Orders orders) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            session.getMapper(OrdersDao.class).addOrder(orders);
            session.commit();
            System.out.println("添加订单成功");
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return false;
    }

    @Override
    public boolean addOrderInfo(int oid, int pid) {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            session.getMapper(OrdersDao.class).addOrderInfo(oid,pid);
            session.commit();
            System.out.println("添加订单详情成功");
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return false;
    }

    @Override
    public List<Orders> findOrdersList() {
        SqlSession session= MybatisUtil.getSqlSession();
        try{
            List<Orders> ords=session.getMapper(OrdersDao.class).findOrdersList();
            for(Orders ord:ords){
                System.out.println(ord.getOid()+","+ord.getOname()+","+ord.getOintime());
                if(ord.getProducts().size()>0) {
                    List<Product> prods = ord.getProducts();
                    for(Product p:prods){
                        System.out.print(p.getPname()+",");
                    }
                    System.out.println();
                }else{
                    System.out.println("订单内容为空");
                }
            }
            return ords;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
}
