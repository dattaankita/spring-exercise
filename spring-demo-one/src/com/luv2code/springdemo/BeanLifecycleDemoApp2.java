package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp2 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext2.xml");
		
		//retrieve beans from spring container
		Coach thecoach = context.getBean("myCoach", Coach.class);
		
		
		System.out.println(thecoach.getDailyWorkout());
		
		context.close();

	}

}
