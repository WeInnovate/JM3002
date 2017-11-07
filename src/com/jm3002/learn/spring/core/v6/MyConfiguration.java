package com.jm3002.learn.spring.core.v6;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.jm3002.learn.spring.core.v6")
@PropertySource("classpath:car.properties")
public class MyConfiguration {

}
