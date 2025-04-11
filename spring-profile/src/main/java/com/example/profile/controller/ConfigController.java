package com.example.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.profile.ProfileService;

@RestController
@RequestMapping("/config")
class ConfigController {
	private final Environment environment;
    private final ProfileService profileService;

    @Value("${app.message:No message found}")
    private String message;

    public ConfigController(Environment environment, ProfileService profileService) {
        this.environment = environment;
        this.profileService = profileService;
    }

    @GetMapping
    public String getConfig() {
        String activeProfile = environment.getProperty("spring.profiles.active", "default");
        return "Active Profile: " + activeProfile + " | Message: " + message + " | Config: " + profileService.getProfileConfig();
    }

	/*
	@Autowired
	ProfileService profileService;

    @Value("${spring.profiles.active:default}")
    private String activeProfile;

    @Value("${app.message:No message found}")
    private String message;

    
    @GetMapping
    public String getConfig() {
        return "Active Profile: " + activeProfile + " | Message: " + message + " | Config: " + profileService.getProfileConfig();
    }
    */
}

