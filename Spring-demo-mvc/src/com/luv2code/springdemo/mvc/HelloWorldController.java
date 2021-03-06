package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showPage")
	public String showPage() {
		return "hello-world-form";
	}
	
	
	@RequestMapping("/processPage")
	public String processPage() {
		return "hello-world";
	}


	@RequestMapping("/processform")
	public String letShoutDude(HttpServletRequest request, Model model) {
		String thename= request.getParameter("fname");
		thename= thename.toUpperCase();
		String result = "Yo " +thename;
		model.addAttribute("message", result);
		return "hello-world";
		
	}
	
	@RequestMapping("/processformV2")
	public String letShoutDude1(@RequestParam("fname") String thename, Model model) {
		thename= thename.toUpperCase();
		String result = "Yo " +thename;
		model.addAttribute("message", result);
		return "hello-world";
		
	}
}
