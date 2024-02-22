package org.SpringCoreXmlConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext cnt= new ClassPathXmlApplicationContext("org/SpringCoreXmlConfig/config.xml");
     Employee e =   cnt.getBean("e",Employee.class);
     System.out.println(e);
    }
}
