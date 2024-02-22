package com.spr.jdbc.dao;

import com.spr.jdbc.entity.Student;

public interface StudentDao {
	
	public int insert(Student s);
	public int update(Student s);
	public int delete(int id);
	public Student viweRecord( int id);

}
