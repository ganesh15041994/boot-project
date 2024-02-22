package com.org.mapDep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplictaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext cnt = new ClassPathXmlApplicationContext("com/org/mapDep/mapConfig.xml");
	Course c = cnt.getBean("c",Course.class);
	System.out.println(c);

	}

}
