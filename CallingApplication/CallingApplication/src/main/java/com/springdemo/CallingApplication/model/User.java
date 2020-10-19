package com.springdemo.CallingApplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="user_name")
	private String userName;
	@Column(name="phonenumber")
	private int phoneNumber;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="callstatus")
	private int callStatus;
	
	public User() {
		
	}
	
	public User(String userName, int phoneNumber, String email, String password, int callStatus) {
		
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		this.callStatus = callStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCallStatus() {
		return callStatus;
	}

	public void setCallStatus(int callStatus) {
		this.callStatus = callStatus;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", password=" + password + ", callStatus=" + callStatus + "]";
	}
	
	
	
	
}
