package com.org.spring.standalone.coll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext cnt	=new ClassPathXmlApplicationContext("com/org/spring/standalone/coll/Alone_config.xml");
	Person p =cnt.getBean("p",Person.class);
	

System.out.println(p.getFriends());
System.out.println(p.getFees().getClass().getName());
System.out.println("===========================================");
System.out.println();

System.out.println(p.getFees());
System.out.println(p.getFees().getClass().getName());
System.out.println("===========================================");
System.out.println();


System.out.println(p.getProperies());
System.out.println(p.getProperies().getClass().getName());
System.out.println("===========================================");
System.out.println();


 


	}

}
