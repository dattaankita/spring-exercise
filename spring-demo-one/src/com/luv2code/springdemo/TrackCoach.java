package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fs;
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fs) {
		this.fs = fs;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getdailyFortune() {
		// TODO Auto-generated method stub
		return "just do it:" + fs.getFortune();
	}
    public void startupStuff() {
    	System.out.println("Track: you are going inside the class");
    }
    
    public void cleanupStuff() {
    	System.out.println("Track: you are going out the class");
    }
}
