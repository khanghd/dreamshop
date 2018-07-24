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
public class Account implements Serializable{
    
    private long idAcc;
    private String userName;
    private String password;
    private Role role;

    public Account() {
    }

    public Account(long idAcc, String userName, String password, Role role) {
        this.idAcc = idAcc;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    
    public long getIdAcc() {
        return idAcc;
    }

    public void setIdAcc(long idAcc) {
        this.idAcc = idAcc;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    
    
    
}
