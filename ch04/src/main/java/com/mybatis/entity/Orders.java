package com.mybatis.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/1/26.
 */
public class Orders implements Serializable {

    private int oid;
    private String oname;
    private Date ointime;

    //一个订单可以订购多个商品
    private List<Product> products=new ArrayList<Product>();

    public Orders() {
    }

    public Orders(int oid, String oname, Date ointime) {
        this.oid = oid;
        this.oname = oname;
        this.ointime = ointime;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public Date getOintime() {
        return ointime;
    }

    public void setOintime(Date ointime) {
        this.ointime = ointime;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
