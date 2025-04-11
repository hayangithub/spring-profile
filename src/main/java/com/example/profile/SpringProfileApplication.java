package com.example.profile;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringProfileApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringProfileApplication.class, args);
	}
	
	@Bean
    public ApplicationRunner logEnvironmentVariables() {
        return args -> {
            System.out.println("=== Environment Variables ===");
            System.getenv().forEach((key, value) -> System.out.println(key + "=" + value));
            System.out.println("============================");
        };
    }

}
