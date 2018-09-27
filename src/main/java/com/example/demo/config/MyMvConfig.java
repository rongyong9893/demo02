package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyMvConfig extends WebMvcConfigurerAdapter {

   @Bean //将组件注册到容器中
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter()
   {
       WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter(){
           @Override
           public void addViewControllers(ViewControllerRegistry registry) {
                //super.addViewControllers(registry);
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/login.html").setViewName("login");
           }
       };

       return adapter;
   }

}
