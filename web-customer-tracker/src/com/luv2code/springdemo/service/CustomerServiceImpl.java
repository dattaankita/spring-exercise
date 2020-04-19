package com.luv2code.springdemo.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.Customerdao;
import com.luv2code.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private Customerdao customerdao;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		return customerdao.getCustomers();
		
	}

	@Override
	@Transactional
	public void saveCustomer(Customer thecust) {
		
		customerdao.saveCustomer(thecust);
	}

}
