package com.luv2code.springdemo;

public class GolfCoach implements Coach {
	private FortuneService fs;

	public GolfCoach(FortuneService fs) {
		super();
		this.fs = fs;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "ball should go to hole";
	}

	@Override
	public String getdailyFortune() {
		// TODO Auto-generated method stub
		return "One day will come for you";
	}

}
