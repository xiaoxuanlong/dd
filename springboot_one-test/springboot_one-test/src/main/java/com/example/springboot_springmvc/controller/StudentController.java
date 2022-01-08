package com.example.springboot_springmvc.controller;

import com.example.springboot_springmvc.model.Student;
import com.example.springboot_springmvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//@Controller
@RestController  //相当于@Controller+@ResponseBody注解
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private StudentService studentservice;
/*
    @PostMapping(value = "")      进行增加数据操作
    @GetMapping(value = "")       进行查询数据操作
    @DeleteMapping(value = "")    进行删除数据操作
    @PutMapping(value = "")       进行更新数据操作
      工作中一般都使用get（查询）或者post（增删改）请求，其他用到得很少*/
//    @RequestMapping(value = "/query",method = RequestMethod.GET)
    @GetMapping(value = "/query")
//    @ResponseBody
    public Object student1(Integer id){
        Student student = studentservice.queryStuId(id);
        return  student;
    }

//    让http网址接口风格发生改变，/boot/order?id=1021&status=1变成boot/order/1021/1的格式
    @GetMapping(value = "/query2/{id}")
    public Object student2(@PathVariable("id") Integer id){
        Student student = studentservice.queryStuId(id);
        return  student;

    }
    @RequestMapping(value = "put")
    public Object put(String key,String value){
        studentservice.put(key,value);
        return "值已放进redis了";
    }
    @RequestMapping(value = "get")
    public Object get(String key){
        Object value=studentservice.get(key);
        return "数据为"+value;
    }
}
