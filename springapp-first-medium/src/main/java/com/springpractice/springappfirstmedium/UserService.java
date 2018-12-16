package com.springpractice.springappfirstmedium;

import java.util.List;

public interface UserService {
	
	User createUser(User user);
	User updateUser(String id, User user);
	User deleteUser(String id);
	User getUser(String id);
	List<User> listUsers();
}
