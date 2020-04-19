package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.dao.Customerdao;
import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		
		List<Customer> ctm= customerService.getCustomers();
		
		theModel.addAttribute("customers", ctm);
		
		return "list-cust";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		Customer theStud= new Customer();
		theModel.addAttribute("customer", theStud);
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer thecust) {
	
		customerService.saveCustomer(thecust);
		return "redirect:/customer/list";
	}
};
