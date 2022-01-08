package com.example.springboot_springmvc;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.example.springboot_springmvc.mapper")
@ServletComponentScan(basePackages = "com.example.sprinl")
public class SpringbootSpringmvcApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootSpringmvcApplication.class, args);
    }
}
