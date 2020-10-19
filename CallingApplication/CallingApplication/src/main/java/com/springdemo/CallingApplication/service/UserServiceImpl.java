package com.springdemo.CallingApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.CallingApplication.model.User;
import com.springdemo.CallingApplication.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl( UserRepository theUserRepository) {
		userRepository = theUserRepository;
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User findById(int theId) {
		Optional<User> result = userRepository.findById(theId);
		
		User theUser = null;
		
		if(result.isPresent()) {
			theUser = result.get();
		}
		else {
			throw new RuntimeException("Did not find user id");
		}
		 
	    return theUser;
	}

	@Override
	public void save(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void deleteById(int theId) {
		userRepository.deleteById(theId);
		
	}

	@Override
	public User findByUserName(String username) {
		Optional<User> result = userRepository.findByUserName(username);
		
		User theUser = null;
		
		if(result.isPresent()) {
			theUser = result.get();
		}
		else {
			throw new RuntimeException("Did not find user name");
		}
		 
	    return theUser;
		
	}

	@Override
	public User findByPassword(String password) {
		Optional<User> result = userRepository.findByPassword(password);
		
		User theUser = null;
		
		if(result.isPresent()) {
			theUser = result.get();
		}
		else {
			throw new RuntimeException("Did not find password");
		}
		 
	    return theUser;
	}

	@Override
	public void updateStatus(String username) {
		
		
	}

}
