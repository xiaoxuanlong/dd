package com.example.springboot_springmvc.config;

import com.example.springboot_springmvc.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    //    注册过滤器
    @Bean
    public FilterRegistrationBean myFilterRegistration(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean(new MyFilter());
        filterRegistrationBean.addUrlPatterns("/user/*");
        return filterRegistrationBean;
    }
}
