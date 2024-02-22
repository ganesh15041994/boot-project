package com.org.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.org.springjdbc.entity.Student;

public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public String toString() {
		return "StudentDaoImpl [template=" + template + "]";
	}

	public StudentDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDaoImpl(JdbcTemplate template) {
		super();
		this.template = template;
	}

	
	// overriden method from StudentDao
	public int insert(Student s) {
		String query="insert into student (id,name,sal) values(?,?,?)";
		int result = this.template.update(query,s.getId(),s.getName(),s.getSal());
		return result;
	}
	
	
	
	// for updating record

	public int update(Student s) {
		String query="update student set name=? where id=?";
		return template.update(query,s.getName(),s.getId());
	
	}

	public int delete(int sid) {
		 String query = "delete from student where id=?";
		return this.template.update(query,sid);
	}

}
