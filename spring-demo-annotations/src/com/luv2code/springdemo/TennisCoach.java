package com.luv2code.springdemo;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomService")
	public FortuneService fs;
	
	public TennisCoach() {
		
		System.out.println("initializing.....");
	}

	
	
	@PostConstruct
	public void startupStuff() {
		System.out.println("Starting the work");
	}
	
	@PreDestroy
	public void cleanupStuff() {
		System.out.println("Stoping the work");
	}
//	
//	@Autowired
//	public TennisCoach(FortuneService fs) {
//		
//		this.fs = fs;
//	}
//
//	
//	public FortuneService getFs() {
//		return fs;
//	}
//
//
////    @Autowired
////	public void setFs(FortuneService fs) {
////		this.fs = fs;
////	}
//
//
//
	  @Override
	  public String getDailyWorkout() {
		return "first buy a racket and flower";
	}



	

	@Override
	public String getDailyFortune() {
		return fs.getFortune();
		
		
	}

}
