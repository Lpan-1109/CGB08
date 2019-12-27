package com.cy.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cy.gmall.bean.UmsMember;
import com.cy.gmall.service.UserService;
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

    @Reference
    private UserService userService;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<UmsMember> findAll(){

        return userService.findAll();
    }
}
