package com.example.springboot_springmvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/springboot")
public class IndexController {
    @Autowired
    private School school;
    @RequestMapping(value = "/say")
    @ResponseBody
    public String say(){
        return "Hello,springboot";
    }
    @RequestMapping(value = "/tell")
    @ResponseBody
    public String tell(){
        return "学校名称："+school.getName()+"；学校地址"+school.getAddress();
    }
    @RequestMapping(value = "/webpag")
    public ModelAndView webapp(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("mes","hello，i am springboot view");
        mv.setViewName("webpag");
        return mv;

    }
}
