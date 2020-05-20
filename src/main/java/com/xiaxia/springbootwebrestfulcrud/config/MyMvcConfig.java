package com.xiaxia.springbootwebrestfulcrud.config;

import com.xiaxia.springbootwebrestfulcrud.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//扩展spring mvc 功能
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    //浏览器发送try 请求来到cover页面
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/try").setViewName("cover");
    }

    //所有组件会一起起作用
    @Bean //把组件注册到容器中
    public WebMvcConfigurer webMvcConfigurer(){
        WebMvcConfigurer configurer = new WebMvcConfigurer(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index").setViewName("login");
            }
        };
        return configurer;
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
