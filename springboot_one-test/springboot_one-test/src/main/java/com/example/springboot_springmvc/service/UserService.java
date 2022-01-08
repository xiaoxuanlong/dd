package com.example.springboot_springmvc.service;

import com.example.springboot_springmvc.model.User;

public interface UserService {
    int insertUser(User user);

    User queryUser(Integer id);
}
