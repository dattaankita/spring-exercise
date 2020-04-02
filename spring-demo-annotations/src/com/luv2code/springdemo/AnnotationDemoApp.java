package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Coach coach= context.getBean("thatsillycoach", Coach.class);
		
		Coach coach= context.getBean("tennisCoach", Coach.class);
		
		//Coach alphacoach= context.getBean("tennisCoach", Coach.class);
		
		//Coach coach= context.getBean("cricketCoach", Coach.class);
		
		
//		CricketCoach coach= context.getBean("cricketCoach", CricketCoach.class);
//		
//		System.out.println(coach.getTeam());
//		
//		System.out.println(coach.getEmail());
//
//		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
//		
//		Boolean result= (coach == alphacoach);
//		
//		
//		System.out.println(result);
		
		
		context.close();

	}

}
