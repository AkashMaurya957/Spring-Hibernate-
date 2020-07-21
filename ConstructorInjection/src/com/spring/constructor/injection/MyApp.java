package com.spring.constructor.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Player thePlayer  = context.getBean("myPlayer",Player.class);
		
		System.out.println(thePlayer.runDaily());
		
		System.out.println(thePlayer.getWishes());
		
		context.close();
		
		
	}

}
