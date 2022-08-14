package com.notgabs.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach {

	private FortuneService fortuneService;

	@Autowired
	public TenisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your movements";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
