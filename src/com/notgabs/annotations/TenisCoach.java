package com.notgabs.annotations;

import org.springframework.stereotype.Component;

@Component("thatCoach")
public class TenisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your movements";
	}

}
