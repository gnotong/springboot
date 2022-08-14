package com.notgabs.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("volleyballCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}
