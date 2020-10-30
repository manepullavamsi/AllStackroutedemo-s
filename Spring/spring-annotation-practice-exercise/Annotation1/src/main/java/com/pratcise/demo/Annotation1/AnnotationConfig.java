package com.pratcise.demo.Annotation1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfig {
	
	@Bean
	public Actor actor()
	{
		return new Actor();
	}
	
	@Bean
	public Movie movie()
	{
		return new Movie();
	}
}
