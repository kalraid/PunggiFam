package com.fammer.backend;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class corsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry cr) {
        cr.addMapping("/api/*")
        .allowedOrigins("http://172.30.1.15:8080")  // 허용할 주소 및 포트
        .allowedOrigins("http://localhost:8080");  // 허용할 주소 및 포트
    }


}