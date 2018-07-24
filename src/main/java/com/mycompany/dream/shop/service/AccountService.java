/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dream.shop.service;

import com.mycompany.dream.shop.entity.AccountEntity;
import com.mycompany.dream.shop.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DuyKhang
 */
@Service
public class AccountService {
    
    @Autowired
    private AccountRepository accountRepository;
    
    public AccountEntity findByUserNameAndPassword(String username, String password){
        return accountRepository.findByUserNameAndPassword(username, password);
    }
}
