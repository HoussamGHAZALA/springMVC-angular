package fr.houssam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration 
@ComponentScan(basePackages = "com.houssam")
public class SpringConfig extends WebMvcConfigurerAdapter{
}