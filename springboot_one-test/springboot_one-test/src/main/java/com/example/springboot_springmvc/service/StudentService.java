package com.example.springboot_springmvc.service;

import com.example.springboot_springmvc.model.Student;

public interface StudentService {
    Student queryStuId(Integer id);

    void put(String key, String value);

    Object get(String key);
}
