package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve beans from spring container
		CricketCoach thecoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(thecoach.getDailyWorkout());
		
		System.out.println(thecoach.getdailyFortune());
		
		System.out.println(thecoach.getTeam());
		
		System.out.println(thecoach.getEmailAddress());
		
		context.close();

	}

}
