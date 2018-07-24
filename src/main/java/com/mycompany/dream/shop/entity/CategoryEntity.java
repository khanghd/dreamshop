/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dream.shop.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author DuyKhang
 */
@Entity
@Table(name = "TB_CATEGORY")
public class CategoryEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long categoryID;
    
    @Column(name = "categoryName", nullable = true, unique = true, length = 255)
    private String categoryName;
    
    @Column(name = "categoryCode", nullable = true, unique = true, length = 255)
    private String categoryCode;

    @OneToMany(mappedBy = "categoryEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ProductEntity> productEntity;

    public long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(long categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public List<ProductEntity> getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(List<ProductEntity> productEntity) {
        this.productEntity = productEntity;
    }
    
}
