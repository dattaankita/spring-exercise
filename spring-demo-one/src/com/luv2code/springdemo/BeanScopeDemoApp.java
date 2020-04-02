package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve beans from spring container
		Coach thecoach = context.getBean("myCoach", Coach.class);
		
		Coach alphacoach = context.getBean("myCoach", Coach.class);
		
		boolean result= (thecoach == alphacoach);
		
		System.out.println(result);
		
		System.out.println(thecoach+ "\n"+alphacoach);
		
		context.close();

	}

}
