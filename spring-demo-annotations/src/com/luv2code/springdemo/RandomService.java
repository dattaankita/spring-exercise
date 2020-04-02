package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {
	
	public String[] data= {
			"chbvcfenvcidnc",
			"hfebvifnvomcd",
			"nfjnvifneinvnw"
	};
	
	private Random myrandom= new Random();

	@Override
	public String getFortune() {
		
		int index= myrandom.nextInt(data.length);
		String str= data[index];
		return str;
	}

}
