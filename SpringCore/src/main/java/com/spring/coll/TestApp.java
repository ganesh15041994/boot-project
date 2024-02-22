package com.spring.coll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext cntx=new ClassPathXmlApplicationContext("com/spring/coll/cconfig.xml");
		Emp emp =(Emp)cntx.getBean("e");
		System.out.println(emp.getName());
		System.out.println(emp.getPhones());
		System.out.println(emp.getAdds());
		System.out.println(emp.getCourses());
		System.out.println(emp.getPhones().getClass());

	}

}
