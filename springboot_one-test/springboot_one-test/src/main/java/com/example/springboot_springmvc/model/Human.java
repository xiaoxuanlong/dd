package com.example.springboot_springmvc.model;

import lombok.Data;
//这个注解配合lombok依赖和lombok插件，则自动给属性值赋值
@Data
public class Human {
    private Integer id;
//    当sex为1则为男，为0否则为女
    private Integer sex;
    private String name;
}
