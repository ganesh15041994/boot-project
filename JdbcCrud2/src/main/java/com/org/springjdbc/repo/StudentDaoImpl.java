package com.org.springjdbc.repo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.org.springjdbc.entity.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public StudentDaoImpl(JdbcTemplate template) {
		super();
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

	// code for database;
	
	
	public int insert(Student s) {
		String query="insert into student (id,name,sal) values(?,?,?)";
		return template.update(query,s.getId(),s.getName(),s.getSal());
	}

	
	public int updateStudent(Student s) {
		String query ="update student set name=?,sal=? where id=?";
		
		return template.update(query,s.getName(),s.getSal(),s.getId());
	}

	public int deleteRecord(int id) {
		String query ="delete from student where id=?";
		
		return template.update(query,id);
		
	}

	public Student getOneRecord(int id) {
		String query = "select *from student where id=?";
		RowMapper rowMapper = new RowMapperImpl();
		
	Student stud=	template.queryForObject(query,rowMapper,id );
		return stud;
	}
	
	

}
