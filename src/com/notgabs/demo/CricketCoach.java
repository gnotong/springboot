package com.notgabs.demo;
public class CricketCoach implements Coach {
	
	FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public void setEmailAddress(String emailAddress) {
		System.out.println(CricketCoach.class + " Inside setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println(CricketCoach.class + " Inside setTeam");
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public CricketCoach() {
		System.out.println(CricketCoach.class + " Inside constructor");
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
