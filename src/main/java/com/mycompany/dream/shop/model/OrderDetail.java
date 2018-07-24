/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dream.shop.model;

import java.io.Serializable;

/**
 *
 * @author DuyKhang
 */
public class OrderDetail implements Serializable{
    private long odID;
    private Order ordID;
    private Product prdID;

    public OrderDetail() {
    }

    public long getOdID() {
        return odID;
    }

    public void setOdID(long odID) {
        this.odID = odID;
    }

    public Order getOrdID() {
        return ordID;
    }

    public void setOrdID(Order ordID) {
        this.ordID = ordID;
    }

    public Product getPrdID() {
        return prdID;
    }

    public void setPrdID(Product prdID) {
        this.prdID = prdID;
    }

}
