package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigDemoApp {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig2.class);
		
		//Coach coach= context.getBean("swimCoach", Coach.class);
		
		SwimCoach coach= context.getBean("swimCoach", SwimCoach.class);
		
//		Coach coach= context.getBean("tennisCoach", Coach.class);
//		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		System.out.println(coach.getTeam());
		
		context.close();

	}

}
