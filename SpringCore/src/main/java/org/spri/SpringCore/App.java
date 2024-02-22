package org.spri.SpringCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext cnxt = new ClassPathXmlApplicationContext("config.xml");
        Student s = (Student) cnxt.getBean("s");
        System.out.println(s);
        
         Student s1 =(Student)cnxt.getBean("s2");
         System.out.println(s1);
    }
}
 