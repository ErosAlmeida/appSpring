package com.br.appspring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {
    @Bean
    public HelloWorldService helloWorldService() {
        return new HelloWorldService();
    }
    public HelloConfiguration() {
        super();
    }
}
