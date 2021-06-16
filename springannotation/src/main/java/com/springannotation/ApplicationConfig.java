package com.springannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.springannotation.component","com.springannotation.service"})
public class ApplicationConfig {

}
