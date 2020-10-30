package com.pratcise.demo.Annotaton2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
    	Movie movie= context.getBean(Movie.class);
    	System.out.println(movie.toString());
    	
    }
}
