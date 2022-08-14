package com.notgabs.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;

	
	@Override
	public String getDailyWorkout() {
		return "Practice your movements";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + ". Email=" + email + ", team=" + team;
	}
}
