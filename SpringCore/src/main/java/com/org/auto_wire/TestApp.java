package com.org.auto_wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 ApplicationContext con =new ClassPathXmlApplicationContext("com/org/auto_wire/auto_Con.Xml");
		Employee e =  con.getBean("emp",Employee.class);
		System.out.println(e);
		

	}

}
 