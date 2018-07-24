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
public class Order implements Serializable{
    private long ordID;
    private Customer customer;
    private Product prdID;
    private String ordDescription;

    public Order() {
    }

    public long getOrdID() {
        return ordID;
    }

    public void setOrdID(long ordID) {
        this.ordID = ordID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getPrdID() {
        return prdID;
    }

    public void setPrdID(Product prdID) {
        this.prdID = prdID;
    }

    public String getOrdDescription() {
        return ordDescription;
    }

    public void setOrdDescription(String ordDescription) {
        this.ordDescription = ordDescription;
    }
    
}
