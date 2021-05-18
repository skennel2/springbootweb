package com.example.demo.argumentresolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebMVCConfig extends WebMvcConfigurationSupport {
	
	@Autowired
	CustomArgumentResolver argumentResolver;
	
	@Override
	protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		super.addArgumentResolvers(argumentResolvers);
		argumentResolvers.add(argumentResolver);
	}
	
}
