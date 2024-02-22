package com.org.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ApplicationContext cnt =new ClassPathXmlApplicationContext("com/org/spr/config.xml");
		  Employee e =cnt.getBean("emp",Employee.class);
		  System.out.println(e);
	}

}
