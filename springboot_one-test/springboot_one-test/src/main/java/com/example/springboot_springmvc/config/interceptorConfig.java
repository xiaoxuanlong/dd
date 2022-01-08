package com.example.springboot_springmvc.config;

import com.example.springboot_springmvc.interceptor.AdminInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//定义此类为配置文件，相当于之前的XML文件
@Configuration
public class interceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println("===================");
//        mvc:interceptor bean class=""
//        要拦截所有的admin下的路径，只能等到用户登录才可访问
        String[] addPathPatterns={
            "/admin/**"
        };
//        要排除的路径，排除的路径只能在用户登录才可访问
        String[] excludePathPatterns={
            "/admin/out","/admin/error","/admin/login"
        };
        registry.addInterceptor(new AdminInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);


    }
}
