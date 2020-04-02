package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	private FortuneService fs;
	
	public BaseballCoach(FortuneService fs) {
		this.fs = fs;
	}

	@Override
	public String getDailyWorkout(){
		return "Spend 30 min in batting practice";
	}

	@Override
	public String getdailyFortune() {
		// TODO Auto-generated method stub
		return fs.getFortune();
	}
}
