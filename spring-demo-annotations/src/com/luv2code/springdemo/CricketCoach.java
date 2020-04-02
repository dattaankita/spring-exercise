package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
//	@Autowired
//	@Qualifier("randomService")
	 private FortuneService fortuneService;
	 
	 @Value("${foo.email}")
	 private String email;
	     
	 @Value("${foo.team}")
	 private String team;
	 
	 public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	 
//    @Autowired
//	public CricketCoach(@Qualifier("randomService")FortuneService fortuneService) {
//		
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "You are in cricket ground";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
