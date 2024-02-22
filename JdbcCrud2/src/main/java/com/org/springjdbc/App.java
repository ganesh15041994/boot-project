package com.org.springjdbc;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.springjdbc.config.Config;
import com.org.springjdbc.entity.Student;
import com.org.springjdbc.repo.StudentDaoImpl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		AnnotationConfigApplicationContext cntx = new AnnotationConfigApplicationContext(Config.class);

		StudentDaoImpl dao = cntx.getBean("dao", StudentDaoImpl.class);

		Scanner scan = new Scanner(System.in);

		do {

			System.out.println("1 For Insert a data In Student Table");
			System.out.println();
			System.out.println("2 For Update a Data in Student Table ");
			System.out.println();
			System.out.println("3 For Delete a Data From Student Table");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:

				Student s = new Student();
				System.out.println("Enter The Id Name and Salary Of Student.....");
				int id = scan.nextInt();
				String name = scan.nextLine();
				scan.nextLine();
				int sal = scan.nextInt();

				s.setId(id);
				s.setName(name);
				s.setSal(sal);
				scan.nextLine();
				int r = dao.insert(s);

				if (r > 0) {
					System.out.println("Data Inserted ...." + r + "   Row Inserted in table");
				} else {
					System.out.println("Something went wrong");
				}

				break;
			case 2:

				Student s1 = new Student();
				scan.nextLine();
				System.out.println("Enter The Name and Sal you want to change");
				name = scan.nextLine();
				s1.setName(name);

				sal = scan.nextInt();
				s1.setSal(sal);
				System.out.println("Enter the Id for changeing record...");
				id = scan.nextInt();
				s1.setId(id);
				int result = dao.updateStudent(s1);
				if (result > 0) {
					System.out.println(result + " rows Updated");

				} else {
					System.out.println("Something went wrong");
				}
				break;
			case 3:

				System.out.println("Enter The Id For Delete The Record Of Student");
				id = scan.nextInt();
				r = dao.deleteRecord(id);
				if (r > 0) {
					System.out.println("Row Deleted +   " + r);
				} else {
					System.out.println("Something went wrong ...");
				}
				break;

			case 4:
				System.out.println("Enter the Id For Search");
				id = scan.nextInt();

				Student ss = dao.getOneRecord(id);

				if (ss != null) {
					System.out.println(ss);
				} else {
					System.out.println("Id Not Present");
				}
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Wrong Input");
			}

		} while (true);

	}
}
