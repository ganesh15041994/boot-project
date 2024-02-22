package org.techhub.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class UserRepositaryImpl implements UserRepositary {

	@Autowired
	
	
	private JdbcTemplate jdbcTemplate;
	private static final String Insert_Query="insert into user(id,fname,lname,email) values(?,?,?,?)";
	private static final String Updade_Query = "update set fname=? where id=? ";
	private static final String Get_User = "select *from user where id=?";
	private static final String Delete_User = "Delete from user where id =?";
	private static final String Get_Users= "Select *from user";
	public User saveUser(User user) {
		return null;
	}

	@Override
	public User updateUser(User user) {
		//jdbcTemplate.update(Updade_Query user.getId());
		return null;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> allUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
