package com.org.springjdbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.org.springjdbc.repo.StudentDaoImpl;

@Configuration
public class Config {

	@Bean(name = { "ds" })
	public DriverManagerDataSource getConn() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;

	}

	@Bean(name = { "template" })
	public JdbcTemplate getTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getConn());
		return template;
	}

	@Bean(name = "dao")
	public StudentDaoImpl getStudent() {
		StudentDaoImpl dao = new StudentDaoImpl();
		dao.setTemplate(getTemplate());
		return dao;
	}
}
