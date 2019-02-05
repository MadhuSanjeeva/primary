package com.practice.springannotaions;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Create an array of strings
	private String[] data = {
			"Madhu is lucky today",
			"Sudha is lucky today",
			"Raghava is lucky today"
	};
	
	//Create a random number generator
	private Random random = new Random();
	@Override
	public String getFortune() {
		//pick random string from the array
		int index =  random.nextInt(data.length);
		return "RandomFortuneService : "+data[index];
	}

}
