package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	private String[] fortunes= {"come out from room", 
			"sit on bike and start talking and forgot about all your pains", 
			"then you will reach to the place"
	};
	
	private Random myrand= new Random();

	@Override
	public String getFortune() {
		int i= myrand.nextInt(fortunes.length);
		String str= fortunes[i];
		return str;
	}

}
