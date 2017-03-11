package com.mightyjava.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mightyjava.model.User;
import com.mightyjava.repository.UserRepository;
import com.mightyjava.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> userList() {
		return userRepository.findAll();
	}

	@Override
	public User findOne(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public String deleteUser(Long id) {
		userRepository.delete(id);
		return "{'message':'User deleted successfully.'}";
	}

}
