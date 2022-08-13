package com.notgabs.demo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {
	
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do track things";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}
	
	public void init() {
		System.out.println("TrackCoach initialization");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("TrackCoach destruction");
	}

}
