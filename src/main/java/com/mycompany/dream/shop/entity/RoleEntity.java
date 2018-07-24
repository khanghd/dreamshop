/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dream.shop.entity;

import com.mycompany.dream.shop.enums.RoleEnums;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author DuyKhang
 */
@Entity
@Table(name = "TB_ROLE")
public class RoleEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;
    
    @Column(name = "role", nullable = true)
    @Enumerated(EnumType.STRING)
    private RoleEnums role;

    
    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

  
    public RoleEnums getRole() {
        return role;
    }

    public void setRole(RoleEnums role) {
        this.role = role;
    }
    
    
}
