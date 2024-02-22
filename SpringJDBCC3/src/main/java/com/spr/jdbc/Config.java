package com.spr.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spr.jdbc.dao.StudentDaoImpl;

@Configuration
public class Config {

	@Bean(name = "ds")
	public DriverManagerDataSource getCon() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;

	}

	@Bean(name = "temp")
	public JdbcTemplate getTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getCon());

		return template;
	}

	@Bean(name = "dao")
	public StudentDaoImpl getStudent() {

		StudentDaoImpl dao = new StudentDaoImpl();
		dao.setTemplate(getTemplate());
		return dao;

	}

}
