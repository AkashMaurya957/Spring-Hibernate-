package com.spring.injecting.literal.values;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketPlayer thePlayer = context.getBean("myPlayer",CricketPlayer.class);
		
		System.out.println("Exercise daily : "+thePlayer.getDailyExercies());
		
		System.out.println("Good Wishes : "+thePlayer.getGoodWishes());
		
		
		System.out.println(thePlayer.getEmail());
		
		System.out.println(thePlayer.getTeam());
		
		context.close();
		
	}
}
