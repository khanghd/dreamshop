/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dream.shop.entity;

import com.mycompany.dream.shop.enums.CusGender;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author DuyKhang
 */
@Entity
@Table(name = "TB_CUSTOMER")
public class CustomerEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerID;
    
    @Column(name = "customerName", length = 255, nullable = true)
    private String customerName;
    
    @Column(name = "customerAddress", length = 255, nullable = true)
    private String customerAddress;
    
    @Column(name = "customerEmail", length = 255, nullable = true, unique = true)
    private String customerEmail;
    
    @Column(name = "customerPhone", nullable = true, unique = true)
    private String customerPhone;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "customerBirthday")
    private Date customerBirthday;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "cusGender")
    private CusGender cusGender;

    @OneToOne
    @JoinColumn(name = "id")
    private AccountEntity accountEntity;
    
    @OneToMany (mappedBy = "customerEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderEntity> orderEntity;

    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public Date getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(Date customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public CusGender getCusGender() {
        return cusGender;
    }

    public void setCusGender(CusGender cusGender) {
        this.cusGender = cusGender;
    }

    public AccountEntity getAccountEntity() {
        return accountEntity;
    }

    public void setAccountEntity(AccountEntity accountEntity) {
        this.accountEntity = accountEntity;
    }

    public List<OrderEntity> getOrderEntity() {
        return orderEntity;
    }

    public void setOrderEntity(List<OrderEntity> orderEntity) {
        this.orderEntity = orderEntity;
    }
 
}
