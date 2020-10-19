package com.springdemo.CallingApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.CallingApplication.model.User;
import com.springdemo.CallingApplication.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService heuserService) {
		userService = heuserService;
	}
	

	

	@GetMapping("/users")
	public List<User> findAll() {
		return userService.findAll();
	}

	@GetMapping("/users/{username}/{password}")
	public String LoginUser(@PathVariable String username, @PathVariable String password) {
		
		User theUser1 = userService.findByUserName(username);
		User theUser2 = userService.findByPassword(password);
		
		if (theUser1 != null && theUser2 != null) {
			if(theUser1 == theUser2) {
				return "User Logged in successfully";
			}
			else {
				throw new RuntimeException("Username or Password is wrong");
			}
		}
		else {
				throw new RuntimeException("User not found");
		}
		
		
	}
	
	

	@PostMapping("/users")
	public String addUser(@RequestBody User theUser) {
		
		
		theUser.setId(0);
		
		userService.save(theUser);
		
		return "User Registered successfully";
	}
	
	@PutMapping("/users/{username}")
	public String updateStatus(@PathVariable String username, @RequestBody User theUser) {
		
	    userService.save(theUser);
		return "Status Updated successfully";
	}
	
//	@PatchMapping("/users/{username}")
//	public String updateStatus(@PathVariable String username, @RequestBody int callStatus) {
//		User theUser = userService.findByUserName(username);
//	    userService.save(callStatus);
//		return "Status Updated successfully";
//	}
//	
//	@GetMapping("/hello")
//	public String Hello() {
//		return "Hello World";
//	}
	
	
//	@GetMapping("/users/{userId}")
//	public User getUser(@PathVariable int userId) {
//		
//		User theUser = userService.findById(userId);
//		
//		if (theUser == null) {
//			throw new RuntimeException("User id not found");
//		}
//		
//		return theUser;
//	}
//	
	
	
	
	
	@PutMapping("/users")
	public User updateUser(@RequestBody User theUser) {
		
		userService.save(theUser);
		
		return theUser;
	}
	
	
	@DeleteMapping("/users/{userId}")
	public String deleteUser(@PathVariable int userId) {
		
		User tempUser = userService.findById(userId);
		
		
		
		if (tempUser == null) {
			throw new RuntimeException("Employee id not found - " + userId);
		}
		
		userService.deleteById(userId);
		
		return "Deleted user id successfully";
	}

}
