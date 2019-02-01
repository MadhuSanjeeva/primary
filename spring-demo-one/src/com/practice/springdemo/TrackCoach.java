package com.practice.springdemo;

public class TrackCoach implements Coach {

	public FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Run hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do it : "+fortuneService.getFortune();
	}

}
