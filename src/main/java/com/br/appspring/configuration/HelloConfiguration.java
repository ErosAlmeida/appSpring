package com.br.appspring.configuration;

import com.br.appspring.controller.HelloWorldService;
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
