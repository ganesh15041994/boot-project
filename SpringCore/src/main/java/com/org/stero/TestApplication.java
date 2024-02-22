package com.org.stero;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplication {
	public static void main(String[] args) {
		ApplicationContext cnt = new ClassPathXmlApplicationContext("com/org/stero/steroAnno.xml");

		Student stud = cnt.getBean("ob", Student.class);
		System.out.println(stud);
		System.out.println(stud.getAdd());
		System.out.println(stud.getAdd().getClass());
		
	}

}
