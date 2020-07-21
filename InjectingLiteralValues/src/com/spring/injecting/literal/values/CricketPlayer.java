package com.spring.injecting.literal.values;

public class CricketPlayer implements Player {

	
	private Wishes theWishes;
	
	private String email;
	
	private String team;
	
	public void setGoodWishes(Wishes theWishes) {
		
		this.theWishes = theWishes;
		
		
	}
	
	@Override
	public String getDailyExercies() {
		
		return "Practices batting daily for two hours";
	}

	@Override
	public String getGoodWishes() {
	
		return theWishes.getGoodWishes();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {

		this.email = email;
		
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	
	
}
