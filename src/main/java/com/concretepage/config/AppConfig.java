package com.concretepage.config;  
  
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
  
@Configuration 
@ComponentScan("com.concretepage") 
@EnableWebMvc  
@EnableSwagger2

public class AppConfig extends WebMvcConfigurerAdapter{  

}  
