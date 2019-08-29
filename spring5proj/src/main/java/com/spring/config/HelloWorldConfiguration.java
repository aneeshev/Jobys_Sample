package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ComponentScan(basePackages = {"com.finastra.spring.annotated"})
@Configuration
public class HelloWorldConfiguration {

}
