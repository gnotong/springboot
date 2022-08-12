package com.notgabs.demo;
public class CricketCoach implements Coach {
	
	FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println(CricketCoach.class + " Inside it");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(CricketCoach.class + " Inside setFortuneService method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Cricket: " + fortuneService.getFortune();
	}

}
