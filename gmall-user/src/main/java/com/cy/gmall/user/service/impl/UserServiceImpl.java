package com.cy.gmall.user.service.impl;

import com.cy.gmall.bean.UmsMember;
import com.cy.gmall.service.UserService;
import com.cy.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UmsMember> findAll() {
        //UmsMember umsMember = new UmsMember();
        //List<UmsMember> list = userMapper.selectAll();
        return userMapper.selectAll();
    }
}
