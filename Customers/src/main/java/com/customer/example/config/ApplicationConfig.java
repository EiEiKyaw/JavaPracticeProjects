package com.customer.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import	({PersistanceJpaConfig.class})
public class ApplicationConfig {
 
}
