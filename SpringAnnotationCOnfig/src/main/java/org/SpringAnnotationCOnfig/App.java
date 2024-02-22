package org.SpringAnnotationCOnfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hel lo World!" );
        
        AnnotationConfigApplicationContext cnt = new AnnotationConfigApplicationContext(Config.class);
        Student s = cnt.getBean("temp",Student.class);
        System.out.println(s);
        s.show();
        
    }
}
