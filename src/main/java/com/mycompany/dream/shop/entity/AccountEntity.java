/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dream.shop.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author DuyKhang
 */
@Entity
@Table(name = "TB_ACCOUNT")
public class AccountEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountID;
    
    @Column(name ="username", nullable = true, length = 255, unique = true)
    private String userName;
    
    @Column(name ="password", nullable = true, length = 255, unique = true)
    private String password;
    
    private boolean enabled;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "role_relation", joinColumns = @JoinColumn(name = "accountID", referencedColumnName = "accountID"),
            inverseJoinColumns = @JoinColumn(name = "idRole", referencedColumnName = "idRole"))
    private List<RoleEntity> role;
    
    
    @OneToOne(mappedBy = "accountEntity", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private CustomerEntity customerEntity;

    public long getAccountID() {
        return accountID;
    }

    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public List<RoleEntity> getRole() {
        return role;
    }

    public void setRole(List<RoleEntity> role) {
        this.role = role;
    }

    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }
    
   
}
