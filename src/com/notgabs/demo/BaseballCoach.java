package com.notgabs.demo;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "do baseball things";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
