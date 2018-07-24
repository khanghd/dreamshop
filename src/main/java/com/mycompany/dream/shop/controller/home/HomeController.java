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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author DuyKhang
 */
@Controller
public class HomeController {
    
    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String homePage(Model model) {
        model.addAttribute("title", "Dream Shop");
        model.addAttribute("message", "This is home page!");
        return "home";
    }
    @RequestMapping(value = {"/orderpage"}, method = RequestMethod.GET)
    public String orderpage(Model model) {
        
        return "orderpage";
    }
    @RequestMapping(value = {"/user/userpage"}, method = RequestMethod.GET)
    public String userPage(Model model) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof AccountEntity) {
            AccountEntity accountEntity = (AccountEntity) (principal);
            model.addAttribute("username", accountEntity.getUserName());
        }
        model.addAttribute("title", "Dream Shop");
        model.addAttribute("message", "This is page user!");
        return "userpage";
    }
    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String login(Model model) {
        return "login";
    }
    @RequestMapping(value = {"/loginError"}, method = RequestMethod.GET)
    public String loginError(Model model) {
        model.addAttribute("message", "Invalid account username or password.");
        return "login";
    }

}
