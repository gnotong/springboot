package com.notgabs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.notgabs.demo.Coach;
import com.notgabs.demo.CricketCoach;

public class SetterDemoSpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}
