package com.spring.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
	
		ApplicationContext cntx=new ClassPathXmlApplicationContext("com/spring/auto/wire/autoconfig.xml");
			
			Employee emp = cntx.getBean("emp",Employee.class);
			System.out.println(emp);
	}

}
