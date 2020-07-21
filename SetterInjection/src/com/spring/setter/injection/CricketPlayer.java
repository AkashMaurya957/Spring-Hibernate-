package com.spring.setter.injection;

public class CricketPlayer implements Player {

	
	private Wishes theWishes;
	
	


	public void setGoodWishes(GoodWishes theGoodWishes) {
		
		theWishes = theGoodWishes;
	}
	
	@Override
	public String getDailyRoutune() {
		
		return "Pratice  daily batting 6 houes in a field";
	}
	

	@Override
	public String GoodWishes() {
		
		return theWishes.getWishes();
	}
	
	
}
