package com.softvision.training.config;

import javafx.application.Application;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.boot.SpringApplication;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.softvision.training"})
public class AppConfig {

    public static void main (String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }
}
