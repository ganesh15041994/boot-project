package org.techhub.Dao;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public interface UserRepositary {
	
	User saveUser(User user);
	User updateUser(User user);
	User getUserById(int id);
	List<User> allUsers();
	User deleteById(int id);

}
