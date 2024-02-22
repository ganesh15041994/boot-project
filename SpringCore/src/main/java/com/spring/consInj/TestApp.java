package com.spring.consInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext cnx =new ClassPathXmlApplicationContext("com/spring/consInj/consconfig.xml");
		Person p = (Person) cnx.getBean("person");
		
		System.out.println(p); 
		
		Addition ad =(Addition) cnx.getBean("add");
		ad.doSum();

	}

}
