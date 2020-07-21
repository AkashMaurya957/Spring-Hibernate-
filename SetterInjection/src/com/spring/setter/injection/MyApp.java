package com.spring.setter.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String args[]) {
		
		
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Player thePlayer = context.getBean("myPlayer",Player.class);
		
		System.out.println("Player Daily Practice : "+thePlayer.getDailyRoutune());
		
		System.out.println("Player Good Wishes : "+thePlayer.GoodWishes());
		
		
	}
}
