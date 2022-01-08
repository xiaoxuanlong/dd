package com.example.springboot_springmvc.service.impl;

import com.example.springboot_springmvc.mapper.UserMapper;
import com.example.springboot_springmvc.model.User;
import com.example.springboot_springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    @Transactional   //增加事务注解
    public int insertUser(User user) {
        int i = userMapper.insert(user);
//        int a=10/0;
        return i;
    }

    @Override
    public User queryUser(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
