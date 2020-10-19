package com.springdemo.CallingApplication.service;

import java.util.List;

import com.springdemo.CallingApplication.model.User;

public interface UserService {
	
	public List<User> findAll();
	
	public User findById(int theId);
	
	public void save(User emp);
	
	public void deleteById(int theId);

	public User findByUserName(String username);

	public User findByPassword(String password);

	public void updateStatus(String username);
	
	}


