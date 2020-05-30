package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Employee;


@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOJpaImpl(EntityManager theentityManager) {
		entityManager = theentityManager;
	}

	@Override
	public List<Employee> findAll() {
		
		Query qry= entityManager.createQuery("from Employee");
		List<Employee> emp= qry.getResultList();
		return emp;
	}

	@Override
	public Employee findById(int theId) {
		Employee emp= entityManager.find(Employee.class, theId);
		return emp;
	}

	@Override
	public void save(Employee emp) {
		Employee theemp = entityManager.merge(emp);
		emp.setId(theemp.getId());

	}

	@Override
	public void deleteById(int theId) {
	
		Query qry= entityManager.createQuery("delete from Employee where id=:employeeId");
		qry.setParameter("employeeId", theId);
		qry.executeUpdate();

	}

}
