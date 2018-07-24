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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author DuyKhang
 */
@Entity
@Table(name = "TB_PRODUCT")
public class ProductEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productID")
    private long productID;
    
    @Column(name = "productName", nullable = true, length = 255)
    private String productName;
    
    @Column(name = "productPrice", nullable = true)
    private double productPrice;
    
    @Column(name = "productQuantity", nullable = true)
    private long productQuantity;

    @ManyToOne
    @JoinColumn(name = "categoryID")
    private CategoryEntity categoryEntity;
    
    @ManyToOne
    @JoinColumn(name = "promotionID")
    private PromotionEntity promotionEntity;
    
    @OneToMany(mappedBy = "productEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderEntity> orderEntity;
    
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "TB_imageproduct", 
            joinColumns = @JoinColumn(name = "productID", referencedColumnName = "productID"),
            inverseJoinColumns = @JoinColumn(name = "imgId", referencedColumnName = "imgId"))
    private List<ImageEntity> imageEntity;

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public long getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(long productQuantity) {
        this.productQuantity = productQuantity;
    }

    public CategoryEntity getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }

    public PromotionEntity getPromotionEntity() {
        return promotionEntity;
    }

    public void setPromotionEntity(PromotionEntity promotionEntity) {
        this.promotionEntity = promotionEntity;
    }

    public List<OrderEntity> getOrderEntity() {
        return orderEntity;
    }

    public void setOrderEntity(List<OrderEntity> orderEntity) {
        this.orderEntity = orderEntity;
    }

    public List<ImageEntity> getImageEntity() {
        return imageEntity;
    }

    public void setImageEntity(List<ImageEntity> imageEntity) {
        this.imageEntity = imageEntity;
    }
     
}
