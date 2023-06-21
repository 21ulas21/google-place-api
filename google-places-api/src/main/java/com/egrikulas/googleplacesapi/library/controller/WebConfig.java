package com.egrikulas.googleplacesapi.library.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/organisations/my-location")
                .allowedOrigins("http://127.0.0.1:5500")
                .allowedMethods("GET");
    }
}
