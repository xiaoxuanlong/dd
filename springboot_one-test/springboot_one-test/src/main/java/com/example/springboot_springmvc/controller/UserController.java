package com.example.springboot_springmvc.controller;


import com.example.springboot_springmvc.mapper.UserMapper;
import com.example.springboot_springmvc.model.User;
import com.example.springboot_springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
// @RestController
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Object insertUser(User user){
        int i = userService.insertUser(user);
        return i+"被更改";
    }
    @GetMapping(value = "/query/{id}")
    public Object queryUser(@PathVariable("id") Integer id){
        User user = userService.queryUser(id);
        return user;

    }
    @RequestMapping(value = "/test")
    public Object test(){
        return "test";
    }
/*    @RequestMapping(value = "/query",method = RequestMethod.POST)
    public int insertUser(Integer id){
        int i = userService.queryUser(user);
        return i;
    }*/
}
