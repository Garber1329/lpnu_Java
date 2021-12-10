package com.example.bakeryProject.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(final ViewControllerRegistry registry) {
        registry.addViewController("/registration").setViewName("registration");
        registry.addViewController("/").setViewName("registration");
        registry.addViewController("/profile").setViewName("index");
        registry.addViewController("/admin").setViewName("indexAdmin");
    }
}
