package com.spring.constructor.injection;

public class CricketPlayer implements Player{

	
	private Wishes wishes;
	
	public  CricketPlayer(Wishes theWishes) {
		
		wishes  = theWishes;
		
		
	}

	@Override
	public String runDaily() {
		// TODO Auto-generated method stub
		return "Practice 4 hour batting daily";
	}

	@Override
	public String getWishes() {
		// TODO Auto-generated method stub
		
		return wishes.getFortune();
	}
	
	
	
	
	
}
