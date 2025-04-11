package com.example.profile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.profile.ProfileService;

@Configuration
@Profile("prod")
class ProdConfig {
    @Bean
    public ProfileService prodProfileService() {
        return () -> "Production Configuration Loaded";
    }
}
