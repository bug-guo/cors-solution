package com.luguoyipaishu.config;

import com.luguoyipaishu.filters.OriginFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 路过一排树
 * @date 2020/11/25 22:08
 */
@Configuration
@ComponentScan(basePackages = {
        "com.luguoyipaishu.controller",
        "com.luguoyipaishu.service"
})
public class Config implements WebMvcConfigurer {

    @Bean
    public FilterRegistrationBean<OriginFilter> originFilter() {
        FilterRegistrationBean<OriginFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new OriginFilter());
        bean.addUrlPatterns("/filter/login");
        return bean;
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/webfilter/login")
//                .allowedOrigins("*")
                .allowedOrigins("http://localhost:8080")
                .allowedMethods("PUT", "DELETE", "OPTIONS", "POST", "GET")
                .allowedHeaders("Content-Type", "Content-Length,Authorization, Accept, X-Requested-With,X-App-Id,  X-Token")
                .allowCredentials(true).maxAge(3600);
    }
}
