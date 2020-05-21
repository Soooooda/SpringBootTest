package com.xiaxia.springbootwebrestfulcrud.config;

import com.xiaxia.springbootwebrestfulcrud.component.LoginHandlerInterceptor;
import com.xiaxia.springbootwebrestfulcrud.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
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
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }

            //注册拦截器
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                //静态资源： *.css *.js
                //Springboot已经做好了静态资源映射
//                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
//                        .excludePathPatterns("/index.html","/","/user/login","/static/**","/assets/**","/webjars/**");
        }
        };
        return configurer;
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
