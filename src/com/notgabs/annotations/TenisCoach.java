package com.notgabs.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach {

	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;

	public TenisCoach() {
		System.out.println("Tenis constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your movements";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + " Email=" + email + ", team=" + team;
	}
	
	@PostConstruct
	private void postConstruct() {
		System.out.println("post construct tenis coach");
	}
	
	@PreDestroy
	private void preDestroy() {
		System.out.println("pre destroy tenis coach");
	}
}
