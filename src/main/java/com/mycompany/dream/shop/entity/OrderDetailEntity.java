/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dream.shop.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author DuyKhang
 */
@Entity
@Table(name = "TB_ORDERDETAIL")
public class OrderDetailEntity implements Serializable{
    
    @Id
    @Column(name = "orderdetailID", nullable = true)
    private long orderdetailID;
    
    @ManyToOne
    @JoinColumn(name = "orderID")
    private OrderEntity orderEntity;
    
    @Column(name = "orderQuantity", nullable = true)
    private long orderQuantity;
    
    @Column(name = "totalPrice")
    private double totalPrice;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "orderDate")
    private Date orderDate;
    
    @Column(name = "shipAddress", nullable = true, length = 255)
    private String shipAddress;

    public long getOrderdetailID() {
        return orderdetailID;
    }

    public void setOrderdetailID(long orderdetailID) {
        this.orderdetailID = orderdetailID;
    }

    public OrderEntity getOrderEntity() {
        return orderEntity;
    }

    public void setOrderEntity(OrderEntity orderEntity) {
        this.orderEntity = orderEntity;
    }

    public long getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(long orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }
    
}
