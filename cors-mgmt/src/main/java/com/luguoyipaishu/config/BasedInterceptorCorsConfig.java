package com.luguoyipaishu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 基于拦截器原理的配置
 *
 * @author 路过一排树
 * @date 2020/10/29 22:26
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {
        "com.luguoyipaishu.controller",
        "com.luguoyipaishu.service"})
public class BasedInterceptorCorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
//                .allowedOrigins("*")
                .allowedOrigins("http://localhost:8080")
                .allowedMethods("PUT", "DELETE","OPTIONS","POST","GET")
                .allowedHeaders("Content-Type", "Content-Length,Authorization, Accept, X-Requested-With,X-App-Id,  X-Token")
                .allowCredentials(true).maxAge(3600);

    }
}
