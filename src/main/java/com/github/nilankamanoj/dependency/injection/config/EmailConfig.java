package com.github.nilankamanoj.dependency.injection.config;

import com.github.nilankamanoj.dependency.injection.service.GoogleEmailService;
import com.github.nilankamanoj.dependency.injection.service.YahooEmailService;
import com.github.nilankamanoj.dependency.injection.service.EmailService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmailConfig {

    @Bean
    @ConditionalOnProperty(name = "email.service", havingValue = "google", matchIfMissing = true)
    public EmailService googleEmailService() {
        return new GoogleEmailService();
    }

    @Bean
    @ConditionalOnProperty(name = "email.service", havingValue = "yahoo")
    public EmailService yahooEmailService() {
        return new YahooEmailService();
    }

    public static class DependancyConfig {
    }
}