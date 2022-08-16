package com.notgabs.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// ICI ON DEFINIT LES RELATIONS ENTRE NOS BEANS
@Configuration
@ComponentScan("com.notgabs.java")
public class SportConfig {

	// on definit le bean pour notre sad fortune service
	// Ici, sadFortuneService est l'ID du Bean
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// on definit le bean pour notre swim coach et on lui injecte sa dependence
	// Ici, swimCoach est l'ID du Bean
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
