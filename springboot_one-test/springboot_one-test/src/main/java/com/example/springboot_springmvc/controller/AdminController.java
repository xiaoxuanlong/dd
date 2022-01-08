package com.example.springboot_springmvc.controller;


import com.example.springboot_springmvc.model.Admin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
    @RequestMapping(value = "/login")
    public Object login(HttpServletRequest request){
        Admin admin=new Admin();
        admin.setId(12);
        admin.setAdminname("xxl");
        request.getSession().setAttribute("admin",admin);
        return "hello login";
    }
    @RequestMapping(value = "/center")
    public Object center(){
        return "see center";
    }
    @GetMapping(value ="/out" )
    public Object out(){
        return "Out see time";
    }
    @RequestMapping(value = "error")
    public Object error(){
        return "error";
    }
}
