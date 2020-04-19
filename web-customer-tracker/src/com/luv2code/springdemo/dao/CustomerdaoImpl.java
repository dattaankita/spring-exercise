package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerdaoImpl implements Customerdao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		Session session= sessionFactory.getCurrentSession();
		
		Query<Customer> theqry=session.createQuery("from Customer", Customer.class);
		
		List<Customer> custs= theqry.getResultList();
		
		return custs;
		
	}

	@Override
	public void saveCustomer(Customer thecust) {
		Session session= sessionFactory.getCurrentSession();
		
		session.save(thecust);
	}

}
