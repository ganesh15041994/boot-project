package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext  cntx=new ClassPathXmlApplicationContext("com/spring/ref/conref.xml");
		 
		A a = (A)cntx.getBean("aref");
		System.out.println(a.getX());
		System.out.println(a.getObj().getY());
		
		
		System.out.println(a);
	}

}
