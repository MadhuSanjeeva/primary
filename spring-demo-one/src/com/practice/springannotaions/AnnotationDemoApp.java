package com.practice.springannotaions;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextForAnnotations.xml");
				
		//retrieve the bean
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
				
		//calls method in the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//calls the method to get fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
