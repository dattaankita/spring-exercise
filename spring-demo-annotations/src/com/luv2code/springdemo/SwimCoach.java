package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	

	 @Value("${foo.team}")
	 private String team;
	 

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	public SwimCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}
	

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 mt";
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
