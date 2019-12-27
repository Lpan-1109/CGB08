package com.cy.gmall.user.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.cy.gmall.bean.UmsMember;
import com.cy.gmall.service.UserService;
import com.cy.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UmsMember> findAll() {
        return userMapper.selectAll();
    }
}
