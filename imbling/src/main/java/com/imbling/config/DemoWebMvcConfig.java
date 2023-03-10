package com.imbling.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.imbling.interceptor.AuthInterceptor;

@Configuration
public class DemoWebMvcConfig implements WebMvcConfigurer { 

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(new AuthInterceptor()).excludePathPatterns("/member/login");
		
	}
	
}
//