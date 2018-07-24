/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dream.shop.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author DuyKhang
 */
public class Product implements Serializable{
    
    private long prdID;
    private String prdName;
    private double prdPrice;
    private long prdQuantity;
    private Category ctgID;
    private Promotion proID;
    
    public Product() {
    }

    public long getPrdID() {
        return prdID;
    }

    public void setPrdID(long prdID) {
        this.prdID = prdID;
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

    public double getPrdPrice() {
        return prdPrice;
    }

    public void setPrdPrice(double prdPrice) {
        this.prdPrice = prdPrice;
    }

    public long getPrdQuantity() {
        return prdQuantity;
    }

    public void setPrdQuantity(long prdQuantity) {
        this.prdQuantity = prdQuantity;
    }

    public Category getCtgID() {
        return ctgID;
    }

    public void setCtgID(Category ctgID) {
        this.ctgID = ctgID;
    }

    public Promotion getProID() {
        return proID;
    }

    public void setProID(Promotion proID) {
        this.proID = proID;
    }
    
}
