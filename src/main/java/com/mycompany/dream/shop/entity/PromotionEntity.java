/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dream.shop.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;

/**
 *
 * @author DuyKhang
 */
@Entity
@Table(name = "TB_PROMOTION")
public class PromotionEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long promotionID;
    
    @Column(name = "promotionName", nullable = true, length = 255, unique = true)
    private String promotionName;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "beginDate")
    private Date beginDate;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "endDate")
    private Date endDate;
    
    
    @Column(name = "promotionDetail", length = 255)
    private String promotionDetail;

    @Column(name = "promotionPercent", nullable = true)
    private int promotionPercent;
    
    @OneToMany(mappedBy = "promotionEntity", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ProductEntity> productEntity;

    public long getPromotionID() {
        return promotionID;
    }

    public void setPromotionID(long promotionID) {
        this.promotionID = promotionID;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getPromotionDetail() {
        return promotionDetail;
    }

    public void setPromotionDetail(String promotionDetail) {
        this.promotionDetail = promotionDetail;
    }

    public int getPromotionPercent() {
        return promotionPercent;
    }

    public void setPromotionPercent(int promotionPercent) {
        this.promotionPercent = promotionPercent;
    }

    public List<ProductEntity> getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(List<ProductEntity> productEntity) {
        this.productEntity = productEntity;
    }

}
