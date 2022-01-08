package com.example.springboot_springmvc.service.impl;

import com.example.springboot_springmvc.mapper.StudentMapper;
import com.example.springboot_springmvc.model.Student;
import com.example.springboot_springmvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;
    @Override
    public Student queryStuId(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;

    }
//    redis的储存于get到
    @Override
    public void put(String key, String value) {
        redisTemplate.opsForValue().set(key,value);
    }
    @Override
    public Object get(String key) {
        Object value = redisTemplate.opsForValue().get(key);
        return  value;
    }
}
