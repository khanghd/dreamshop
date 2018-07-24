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
public class Category implements Serializable{
    private long ctgID;
    private String ctgName;
    private String ctgCode;
 
    public Category() {
    }

    public Category(long ctgID, String ctgName, String ctgCode) throws Exception {
        this.ctgID = ctgID;
        this.ctgName = ctgName;
        this.ctgCode = ctgCode;
    }

    public long getCtgID() {
        return ctgID;
    }

    public void setCtgID(long ctgID) {
        this.ctgID = ctgID;
    }

    public String getCtgName() {
        return ctgName;
    }

    public void setCtgName(String ctgName) {
        this.ctgName = ctgName;
    }

    public String getCtgCode() {
        return ctgCode;
    }

    public void setCtgCode(String ctgCode) {
        this.ctgCode = ctgCode;
    }
   
}
