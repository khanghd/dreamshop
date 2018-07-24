/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dream.shop.model;


import com.mycompany.dream.shop.enums.CusGender;
import java.io.Serializable;

/**
 *
 * @author DuyKhang
 */
//class contain information of customer
public class Customer implements Serializable{
    
    private long cusID;
    private String cusName;
    private String cusAddress;
    private String cusEmail;
    private String cusPhone;
    private String cusBirthday;
    private CusGender cusGender;
    private Account idAcc;

    public Customer() {
    }

    public long getCusID() {
        return cusID;
    }

    public void setCusID(long cusID) {
        this.cusID = cusID;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public String getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(String cusPhone) {
        this.cusPhone = cusPhone;
    }

    public String getCusBirthday() {
        return cusBirthday;
    }

    public void setCusBirthday(String cusBirthday) {
        this.cusBirthday = cusBirthday;
    }

    public CusGender getCusGender() {
        return cusGender;
    }

    public void setCusGender(CusGender cusGender) {
        this.cusGender = cusGender;
    }



    public Account getIdAcc() {
        return idAcc;
    }

    public void setIdAcc(Account idAcc) {
        this.idAcc = idAcc;
    }

}
