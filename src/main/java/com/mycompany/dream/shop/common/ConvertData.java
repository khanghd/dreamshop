/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dream.shop.common;

import com.mycompany.dream.shop.entity.AccountEntity;
import com.mycompany.dream.shop.entity.CategoryEntity;
import com.mycompany.dream.shop.entity.CustomerEntity;
import com.mycompany.dream.shop.entity.ImageEntity;
import com.mycompany.dream.shop.entity.ProductEntity;
import com.mycompany.dream.shop.model.Account;
import com.mycompany.dream.shop.model.Category;
import com.mycompany.dream.shop.model.Customer;
import com.mycompany.dream.shop.model.Image;
import com.mycompany.dream.shop.model.Product;
import com.mycompany.dream.shop.model.Role;
import java.text.SimpleDateFormat;

/**
 *
 * @author DuyKhang
 */
public class ConvertData {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

//    Category
    public static Category convertCategoryFromCategoryEntity(CategoryEntity categoryEntity) throws Exception {
        Category category = new Category(
                categoryEntity.getCategoryID(),
                categoryEntity.getCategoryName(),
                categoryEntity.getCategoryCode());
        return category;
    }

//    Image
    public static Image convertImageFromImageEntity(ImageEntity imageEntity) {
        Image image = new Image(
                imageEntity.getImgId(),
                imageEntity.getImgURL());
        return image;
    }

//    Account
    public static Account convertAccountFromAccountEntity(AccountEntity accountEntity) {
        Account account = new Account(
                accountEntity.getAccountID(),
                accountEntity.getUserName(),
                accountEntity.getPassword(),
                (Role) accountEntity.getRole());
        return account;
    }

// Customer
//    public static Customer convertCustomerFromCustomerEntity(CustomerEntity customerEntity) {
//        String cus_Birthday = sdf.format(customerEntity.getCustomerBirthday());
//        Account account = new Account(
//                customerEntity.getAccountEntity().getAccountID(),
//                customerEntity.getAccountEntity().getUserName(),
//                customerEntity.getAccountEntity().getPassword(),
//                (Role) accountEntity.getRole());
//        Customer customer = new Customer(
//                customerEntity.getIdCus(),
//                customerEntity.getCus_Name(),
//                customerEntity.getCus_Address(),
//                customerEntity.getCus_Email(),
//                customerEntity.getCus_Phone(),
//                cus_Birthday,
//                Cus_Gender.MALE,
//                id_Acc)
//    }

////    Product
//    public static Product convertProductFromProductEntity(ProductEntity productEntity) {
//        Product product = new Product(
//                productEntity.getPrd_Id(),
//                productEntity.getPrd_Name(),
//                productEntity.getPrd_price(),
//                productEntity.getPrd_quantity());
//        return product;
//    }
}
