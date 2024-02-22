package com.spring.lyf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLyfAPp {

	public static void main(String[] args) {
		
		
		// For viewving destroy method we need registerShutdownHook Method and 
		// AbstractApplicationContext Hold That Method
		AbstractApplicationContext  cntx =new ClassPathXmlApplicationContext("com/spring/lyf/Lyfconfig.xml");
		
//		Prod p = (Prod) cntx.getBean("p");
//		System.out.println(p);
//		
//		
//		
//		System.out.println("+++++++++++++++++");
//		Coder c = (Coder) cntx.getBean("c");
//		System.out.println(c);
//		
		cntx.registerShutdownHook();
		
		Example ee = (Example) cntx.getBean("exp");
		System.out.println(ee);
		
	}

}
 