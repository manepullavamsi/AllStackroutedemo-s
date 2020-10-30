package com.pratcise.demo.Annotaton2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
	
	@Bean
	public Actor actor()
	{
		return new Actor("venkat","male",27);
	}
	
	@Bean
	public Movie movie()
	{
		return new Movie(actor());
	}

}
