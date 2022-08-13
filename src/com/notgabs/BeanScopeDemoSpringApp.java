package com.notgabs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.notgabs.demo.Coach;

public class BeanScopeDemoSpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theCoach2 = context.getBean("myCoach", Coach.class);

		System.out.println(theCoach);
		System.out.println(theCoach2);
		context.close();
	}

}
