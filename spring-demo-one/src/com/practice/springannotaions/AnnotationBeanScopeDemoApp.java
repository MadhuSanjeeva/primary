package com.practice.springannotaions;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextForAnnotations.xml");
				
		//retrieve the bean
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
				
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\n Pointing to the same object : "+result);
		
		System.out.println("\n Memory location for theCoach object : "+theCoach.hashCode());
		
		System.out.println("\n Memory location for alphaCoach object : "+alphaCoach.hashCode());
		
		//close the context
		context.close();
	}

}
