package com.emmil.interfaces;

public class Strategy implements MobileGames, VideoGames {
   
	private String name;
	private String rate;
	private String gameType;
	private int audienceScore;
	
	
	public Strategy(String name, String gameType, String rate, int audienceScore) {
		this.name = name;
		this.rate = rate;
		this.gameType = gameType;
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
