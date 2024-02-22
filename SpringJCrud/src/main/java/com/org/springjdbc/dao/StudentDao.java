package com.org.springjdbc.dao;

import com.org.springjdbc.entity.Student;

public interface StudentDao {
	public int insert(Student s);
	
	public int update(Student s );
	
	public int delete(int s);

}
