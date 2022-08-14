package com.notgabs.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("tenisCoach", Coach.class);
		Coach otherCoach = context.getBean("tenisCoach", Coach.class);

		System.out.println("the same: " + (theCoach == otherCoach));
		System.out.println("theCoach reference: " + theCoach);
		System.out.println("otherCoach reference: " + otherCoach);
		
		context.close();
	}

}
