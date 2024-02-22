package com.org.AnnoConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClilentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(Conf.class);
		
		Student stud = con.getBean("f",Student.class);
	//	System.out.println(stud);
		stud.isReading();
		
	}

}
