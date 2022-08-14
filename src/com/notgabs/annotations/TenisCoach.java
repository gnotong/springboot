package com.notgabs.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;

//	@Autowired
//	public TenisCoach(FortuneService fortuneService) {
//		System.out.println("IN TenisCoach constructor");
//		this.fortuneService = fortuneService;
//	}

//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("IN setFortuneService");
//		this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your movements";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
