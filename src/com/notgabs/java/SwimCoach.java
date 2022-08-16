package com.notgabs.java;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Hey " + email +" swim 100 meters as a warm up with the team " + team;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
