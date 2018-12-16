package com.springpractice.springappfirstmedium;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	@SuppressWarnings("finally")
	private User findOne(String id) {
		User instance = null;
		try {
			List<User> users = userRepository.findAll();
			for(User user : users) {
				if(user.getId().equalsIgnoreCase(id)){
					instance = user;
					break;
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			return instance;
		}
	}
	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(String id, User user) {
		User instance = this.findOne(id);
		instance.setName(user.getName());
		return userRepository.save(instance);
	}

	@Override
	public User deleteUser(String id) {
		User instance = this.findOne(id);
		userRepository.delete(instance);
		return instance;
	}

	@Override
	public User getUser(String id) {
		return this.findOne(id);
	}

	@Override
	public List<User> listUsers() {
		return userRepository.findAll();
	}

}
