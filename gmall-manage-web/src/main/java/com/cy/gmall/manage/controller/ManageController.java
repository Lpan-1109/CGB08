package com.cy.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cy.gmall.bean.CatalogService;
import com.cy.gmall.bean.PmsBaseCatalog1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class ManageController {

    @Reference
    private CatalogService catalogService;

    @CrossOrigin
    @RequestMapping("/getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){
        return catalogService.getCatalog1();
    }
}
