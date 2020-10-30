package com.pratcise.demo.Annotation1;

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
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        Actor actor=context.getBean(Actor.class);
        actor.setAge(27);
        actor.setGender("Male");
        actor.setName("Venlat");
        
        Movie movie=context.getBean(Movie.class);
        movie.setActor(actor);
        System.out.println(movie.toString());
    }
}
