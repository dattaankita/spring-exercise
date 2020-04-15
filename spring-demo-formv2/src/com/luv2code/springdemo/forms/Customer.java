package com.luv2code.springdemo.forms;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



public class Customer {
	
	private String fname;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lname;
	
	@NotNull(message="is required")
	@Min(value=0, message=">=0")
	@Max(value=10, message="<=10")
	private Integer freepasses;
	
	@Pattern(regexp="^[1-9a-zA-Z]", message="alphanumeric")
	private String postalCode;

	
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getFreepasses() {
		return freepasses;
	}

	public void setFreepasses(Integer freepasses) {
		this.freepasses = freepasses;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	

}
