package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Coach thecoach= new BaseballCoach();
//		
//		System.out.println(thecoach.getDailyWorkout());
		
		Coach thecoach1= new TrackCoach();
		Coach thecoach2= new HockeyCoach();
		System.out.println(thecoach1.getDailyWorkout());
	}

}
