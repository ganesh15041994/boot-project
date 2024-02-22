package com.org.ObjDep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplication {

	public static void main(String[] args) {
	ApplicationContext cnt=	new ClassPathXmlApplicationContext("com/org./ObjDep/objConfig.xml");

	Employee e = cnt.getBean("e",Employee.class);
	System.out.println(e);
	}

}
