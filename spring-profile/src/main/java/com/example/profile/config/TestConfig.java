package com.example.profile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.profile.ProfileService;

@Configuration
@Profile("test")
class TestConfig {
    @Bean
    public ProfileService testProfileService() {
        return () -> "Test Configuration Loaded";
    }
}
