package com.spr.jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spr.jdbc.dao.StudentDaoImpl;
import com.spr.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		AnnotationConfigApplicationContext cntx = new AnnotationConfigApplicationContext(Config.class);

		StudentDaoImpl dao = cntx.getBean("dao", StudentDaoImpl.class);
		Student s = new Student();
		/*
		 * s.setId(1); s.setName("shubham"); s.setSal(23000);
		 * 
		 * int r = dao.insert(s); if (r > 0) { System.out.println("Inserted ..."); }
		 * else { System.out.println("Went Wrong"); }
		 */
		
		// for Update Record 
		
		/*
		 * s.setId(3); s.setName("yahoku"); s.setSal(12000);
		 * 
		 * int r = dao.update(s); if(r>0) {
		 * System.out.println(r+"   Row Updated succesfully...."); } else {
		 * System.out.println("went Wrong "); }
		 */
		
//		for delete Record 
		
		
		/*
		 * int r = dao.delete(1); if(r>0) { System.out.println(r+"  row Deleted ....");
		 * } else { System.out.println("Something Went Wrong...."); }
		 */
		
		Student ss = dao.viweRecord(3);
		System.out.println(ss);
	}
}
