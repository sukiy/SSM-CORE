package com.mybatis.dao;

import com.mybatis.entity.Orders;

import java.util.List;

/**
 * Created by Administrator on 2018/1/26.
 */
public interface OrdersDao {

    //添加订单
    public boolean addOrder(Orders orders);

    //添加订单相信信息
    public boolean addOrderInfo(int oid,int pid);

    //查询所有订单详细信息
    public List<Orders> findOrdersList();
}
