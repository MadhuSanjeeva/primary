package com.practice.springannotaions;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
//Default bean name tennisCoach with out parameter in @Component
public class TennisCoach implements Coach {

	
	private FortuneService fortuneService;
	
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
