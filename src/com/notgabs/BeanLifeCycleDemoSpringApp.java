package com.notgabs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.notgabs.demo.Coach;

public class BeanLifeCycleDemoSpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);

		System.out.println(theCoach);
		context.close();
	}

}
