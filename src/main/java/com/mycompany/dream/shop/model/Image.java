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
public class Image implements Serializable{
    private long imgID;
    private String imgURL;

    public Image() {
    }

    public Image(long imgID, String imgURL) {
        this.imgID = imgID;
        this.imgURL = imgURL;
    }

    public long getImgID() {
        return imgID;
    }

    public void setImgID(long imgID) {
        this.imgID = imgID;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
 
}
