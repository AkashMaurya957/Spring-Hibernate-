package com.spring.invversionofcontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
	public static void main(String args[]) {
		
		
		// load the spring configuration file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from the spring container 
		Player thePlayer = context.getBean("myPlayer",Player.class);
		
		//call method on the bean
				
		System.out.println(thePlayer.runDaily());
		
		//close the context
		context.close();
		
		
	}

}
