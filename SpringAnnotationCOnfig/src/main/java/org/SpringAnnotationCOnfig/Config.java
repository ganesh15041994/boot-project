package org.SpringAnnotationCOnfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "org.SpringAnnotationCOnfig")
public class Config {
	
	
	
	public Address getAdd()
	{
		return new Address();
	}
	
	@Bean(name= { "student","temp"})

	public Student getStudent()
	{
		//creating Studnet Object
		Student student =new Student(getAdd());
		return student;
	}

}
