/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dream.shop.controller.home;

import com.mycompany.dream.shop.entity.AccountEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author DuyKhang
 */
@Controller
@RequestMapping(value = "/admin/")
public class AdminController {

    @RequestMapping("/adminpage")
    public String showAdmin(Model model) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof AccountEntity) {
            AccountEntity accountEntity = (AccountEntity) (principal);
            model.addAttribute("username", accountEntity.getUserName());
        }
        model.addAttribute("title", "Dream Shop");
        model.addAttribute("message", "This is page admin!");
        return "adminpage";
    }

}

