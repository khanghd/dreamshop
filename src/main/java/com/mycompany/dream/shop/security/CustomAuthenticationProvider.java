/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dream.shop.security;

import com.mycompany.dream.shop.entity.AccountEntity;
import com.mycompany.dream.shop.entity.RoleEntity;
import com.mycompany.dream.shop.service.AccountService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

/**
 *
 * @author DuyKhang
 */
@Component
public class CustomAuthenticationProvider implements AuthenticationProvider{
    
    @Autowired
    private AccountService accountService;
    
    @Override
    public Authentication authenticate(Authentication a) throws AuthenticationException {
        String username = a.getName();
        String password = a.getCredentials().toString();
        AccountEntity accountEntity = accountService.findByUserNameAndPassword(username, password);
        if (accountEntity != null) {
            List<GrantedAuthority> authorities = new ArrayList<>();
            // get list role            
            for (RoleEntity role : accountEntity.getRole()) {
                String roleName = role.getRole().toString();
                authorities.add(new SimpleGrantedAuthority(roleName));
            }
            return new UsernamePasswordAuthenticationToken(
                    accountEntity, username, authorities);
        } else {
            return null;
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
        
    }
}
