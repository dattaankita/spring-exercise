package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//configure the app
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve beans from spring container
		Coach thecoach = context.getBean("myGolfCoach", Coach.class);
		
		System.out.println(thecoach.getDailyWorkout());
		
		System.out.println(thecoach.getdailyFortune());
		
		context.close();
	}

}
