package com.luv2code.springdemo.forms;

import java.util.LinkedHashMap;

public class Student {
	
	private String fname;
	private String lname;
	private String country;
	private String flang;
	private String[] os;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	private LinkedHashMap <String,String> countryOptions;
	
	public Student() {
		
		countryOptions= new LinkedHashMap<>();
		countryOptions.put("br", "brazil");
		countryOptions.put("br1", "brazil1");
		countryOptions.put("br2", "brazil2");
		countryOptions.put("br3", "brazil3");
		
		
		// populate favorite language options
        favoriteLanguageOptions = new LinkedHashMap<>();

        // parameter order: value, display label
        //
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("PHP", "PHP");
        favoriteLanguageOptions.put("Ruby", "Ruby");        
        //<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"  /> 
        

		
	}
	
	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public void setFavoriteLanguageOptions(LinkedHashMap<String, String> favoriteLanguageOptions) {
		this.favoriteLanguageOptions = favoriteLanguageOptions;
	}

	public String getFlang() {
		return flang;
	}

	public void setFlang(String flang) {
		this.flang = flang;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	

}
