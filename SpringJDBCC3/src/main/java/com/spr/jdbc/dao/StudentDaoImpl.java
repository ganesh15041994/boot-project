package com.spr.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spr.jdbc.entity.Student;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int insert(Student s) {

		String query = "insert into student (id,name,sal) values(?,?,?)";
		return template.update(query, s.getId(), s.getName(), s.getSal());

	}

	public int update(Student s) {
		String query = "update student set name=?,sal=? where id=?";

		return template.update(query, s.getName(), s.getSal(), s.getId());

	}

	public int delete(int id) {
		String query = "delete from student where id=?";

		return template.update(query, id);
		
	}

	public Student viweRecord( int id) {
		RowMapperImpl rowMapper = new RowMapperImpl();
		
		String query="select *from student where id =?";
		return template.queryForObject(query, rowMapper,id);
	}

}
