/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dream.shop.repository;

import com.mycompany.dream.shop.entity.ImageEntity;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DuyKhang
 */
@Repository
public interface ImageRepository extends CrudRepository<ImageEntity, Integer>{
    
}
