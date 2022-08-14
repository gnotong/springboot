package com.notgabs.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	private String[] fortunes = {
			"Don’t hold onto things that require a tight grip.",
			"I didn’t come this far to only come this far.",
			"Look how far you've come.",
	};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		int index = random.nextInt(fortunes.length);
		
		String theFortune = fortunes[index];
		
		return theFortune;
	}

}
