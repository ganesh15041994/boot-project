package com.org.collDep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext cnt = new ClassPathXmlApplicationContext("com/org/collDep/colConfig.xml");
		Product p = cnt.getBean("p", Product.class);
		System.out.println(p.getProd().getClass().getName());
	}

}
