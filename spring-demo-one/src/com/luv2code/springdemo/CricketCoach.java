package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	private String team;
	private String emailAddress;
	
	
	private FortuneService fs;
	
    public CricketCoach() {
    	System.out.println("something is going on");
    }
    
	public void setFortuneService(FortuneService fs) {
		this.fs = fs;
	}

	

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice fast bowling";
	}

	@Override
	public String getdailyFortune() {
		// TODO Auto-generated method stub
		return fs.getFortune();
	}

}
