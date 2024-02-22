package com.spr.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spr.jdbc.entity.Student;

public class RowMapperImpl implements RowMapper {

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student s = new Student();
		s.setId(rs.getInt(1));
		s.setName(rs.getString(2));
		s.setSal(rs.getInt(3));
		return s;
	}

}
