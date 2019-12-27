package com.cy.gmall.user.controller;

import com.cy.gmall.bean.UmsMember;
import com.cy.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @ResponseBody
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<UmsMember> findAll(){

        return userService.findAll();
    }
}
