package com.kk.secondProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@EnableWebMvc//
@ComponentScan("com.kk.secondProject")

public class MvcConfig {
	@Bean
    public ViewResolver configureViewResolver() {
        InternalResourceViewResolver viewResolve = new InternalResourceViewResolver();
        viewResolve.setPrefix("/WEB-INF/view/");
        viewResolve.setSuffix(".jsp");

        return viewResolve;
    }

    // Use the DefaultServletHandlerConfigurer 
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
      configurer.enable();
    }

}
