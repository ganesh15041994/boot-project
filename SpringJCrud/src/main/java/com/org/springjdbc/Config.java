package com.org.springjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.org.springjdbc.dao.StudentDao;
import com.org.springjdbc.dao.StudentDaoImpl;

@Configuration
public class Config {

	@Bean(name = "ds")
	public DriverManagerDataSource getConnection() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");

		return ds;
	}

	@Bean(name = "template")
	public JdbcTemplate getTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getConnection());
		return template;
	}
	@Bean(name="dao")
	public StudentDaoImpl getStudent()
	{
		StudentDaoImpl dao = new StudentDaoImpl(getTemplate());
		return dao;
		
	}

}
