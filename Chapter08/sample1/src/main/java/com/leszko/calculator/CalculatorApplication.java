package com.leszko.calculator;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

/**
 * Main Spring Boot Application for the Calculator Service.
 * This application serves as the entry point for the Spring Boot application.
 * It enables caching for the application and can be configured with different caching solutions.
 */
@SpringBootApplication
@EnableCaching
public class CalculatorApplication {

    /**
     * Main method to run the Spring Boot application.
     *
     * @param args Command-line arguments passed to the application
     */
    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }

    // If you're replacing Hazelcast with another cache solution, add that configuration here.
    // For example, you could use simple in-memory cache or Redis.
}

