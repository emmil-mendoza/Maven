package com.emmil.interfaces;

public class Multiplayer implements VideoGames, MobileGames{
 
	private String name;
	private String gameType;
	private String rate;
	private int audienceScore;
	
	
	public Multiplayer(String name, String gameType,String rate, int audienceScore) {
		
		this.name = name;
		this.gameType = gameType;
		this.rate = rate;
		this.audienceScore = audienceScore;
	}
	
	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public String getRate() {
		
		return rate;
	}

	@Override
	public String getGameType() {
		
		return gameType;
	}

	@Override
	public Integer getAudienceScore() {
		
		return audienceScore;
	}

	@Override
	public String toString() {
		
		return String.format("Game Title: %s, Game Type: %s, Game Rating: %s, Audience Score: %d", name, gameType, rate, audienceScore);
	}

	
	
}
