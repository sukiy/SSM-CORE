package com.mybatis.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/26.
 */
public class Product implements Serializable {

    private int pno;
    private String pname;

    //一个商品可以被多个订单订购
    private List<Orders> ords=new ArrayList<Orders>();

    public Product(int pno, String pname) {
        this.pno = pno;
        this.pname = pname;
    }

    public Product() {
    }

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public String getPname() {
        return pname;
    }

    public List<Orders> getOrds() {
        return ords;
    }

    public void setOrds(List<Orders> ords) {
        this.ords = ords;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
