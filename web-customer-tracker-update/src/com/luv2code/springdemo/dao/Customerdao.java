package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface Customerdao {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer thecust);

	public Customer getCustomer(int theid);

	public void deleteCustomer(int theid);

	public List<Customer> searchCustomers(String theSearchName);

	

}
