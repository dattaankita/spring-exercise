package com.springdemo.CallingApplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.springdemo.CallingApplication.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUserName(String username);

	Optional<User> findByPassword(String password);
	
//	@Modifying
//	@Query("UPDATE User u SET u.callStatus = ?1,  WHERE u.userName = ?2")
//	public void updateStatus(String u.userName, String u.callStatus);

}
