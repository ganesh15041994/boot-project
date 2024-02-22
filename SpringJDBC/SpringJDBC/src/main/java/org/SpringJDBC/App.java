package org.SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext cntx = new ClassPathXmlApplicationContext("org/SpringJDBC/Config.xml");

		JdbcTemplate template = (JdbcTemplate) cntx.getBean("jdbcTemplate");

		if (template != null) {
			System.out.println("Connected ...");

			String query = "insert into student2 (id,name,city) values(?,?,?)";

			int i = template.update(query,1,"Ganesh","Rathod");
			if (i > 0) {
				System.out.println("Inserted");
			} else {
				System.out.println("Problem");
			}
		} else {
			System.out.println("Went Wrong");
		}
	}
}
