package com.practice.springannotaions;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")

//Default bean name tennisCoach with out parameter in @Component
@Component
@Scope()
public class TennisCoach implements Coach {

	//Field Injection
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach : inside default constructor");
	}
	
	//Constructor Injection
	/*@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	
	//Setter Injection
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach : setFortuneService() method");
		this.fortuneService = fortuneService;
	}*/
	
	//Method Injection
	/*@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> TennisCoach : doSomeCrazyStuff() method");
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	// define init method
	@PostConstruct
	public void doSomeCrazyStuff() {
		System.out.println(">> TennisCoach : inside of doSomeCrazyStuff()");
	}
	
	// define destroy method
	@PreDestroy
	public void doCleanupStuff() {
		System.out.println(">> TennisCoach : inside of doCleanupStuff()");
	}
}
