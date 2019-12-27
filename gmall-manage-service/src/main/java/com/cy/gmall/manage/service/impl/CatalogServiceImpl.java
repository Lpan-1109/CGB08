package com.cy.gmall.manage.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.cy.gmall.bean.CatalogService;
import com.cy.gmall.bean.PmsBaseCatalog1;
import com.cy.gmall.manage.mapper.Catlog1Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private Catlog1Mapper catlog1Mapper;

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return catlog1Mapper.selectAll();
    }
}
