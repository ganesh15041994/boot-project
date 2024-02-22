package com.org.springjdbc.repo;

import com.org.springjdbc.entity.Student;

public interface StudentDao {
	
	public int insert(Student s);
	
	public int updateStudent(Student s );
	
	public int deleteRecord(int id);
	
	public Student getOneRecord(int id);
	

}
