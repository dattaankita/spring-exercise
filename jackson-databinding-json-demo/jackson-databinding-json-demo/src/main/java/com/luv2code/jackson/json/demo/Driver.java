package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectMapper map= new ObjectMapper();
			
			Student std= map.readValue(new File("data/sample-full.json"), Student.class);
			
			System.out.println(std.getFname());
			
			System.out.println(std.getLname());
			
			Address ad= std.getAddress();
			
			System.out.println(ad.getCity());
			
			for(String temp: std.getLanguages()) {
				System.out.println(temp);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
