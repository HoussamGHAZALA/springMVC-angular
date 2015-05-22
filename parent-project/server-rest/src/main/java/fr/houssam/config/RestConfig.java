package fr.houssam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration 
@ComponentScan(basePackages = "fr.houssam.business")
public class RestConfig extends WebMvcConfigurerAdapter{
}