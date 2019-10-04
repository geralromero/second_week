package com.softvision.training.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.softvision.training"})
public class AppConfig {

    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);

    }
}
