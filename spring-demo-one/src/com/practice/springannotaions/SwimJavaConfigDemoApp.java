package com.practice.springannotaions;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportsConfig.class);
		
		// get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
				
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call our new swimCoach methods... has the props values injected
		System.out.println("Email : "+theCoach.getEmail());
		
		System.out.println("Team : "+theCoach.getTeam());
					
		// close the context
		context.close();
		
	}

}