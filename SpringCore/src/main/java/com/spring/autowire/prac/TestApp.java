package com.spring.autowire.prac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
	
		
	ApplicationContext cntx	=new ClassPathXmlApplicationContext("com/spring/autowire/prac/autowire.xml");
	
	Shop s = (Shop)cntx.getBean("s");
	System.out.println(s);

	}

}
