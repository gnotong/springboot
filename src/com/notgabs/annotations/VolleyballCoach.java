package com.notgabs.annotations;

import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "This is voley morning ball";
	}

}
