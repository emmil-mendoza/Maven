package com.emmil.interfaces.videogames;

public class Game {

	public static void main(String[] args) {

		VideoGames apexlegends = new Multiplayer("Apex Legends", "Multiplayer/Battle Royale", "Everyone", 8);

		System.out.println("Game Title: " + apexlegends.getName());
		System.out.println("Game Type: " + apexlegends.getGameType());
		System.out.println("Game Rating: " + apexlegends.getRate());
		System.out.println("Audience Score: " + apexlegends.getAudienceScore());

		System.out.println(apexlegends instanceof Multiplayer);
		System.out.println(apexlegends instanceof VideoGames);
		System.out.println(apexlegends instanceof Strategy);

		MobileGames clashroyale = new Strategy("Clash Royale", "Strategy Game", "Everyone", 7);

		System.out.println("Game Title: " + clashroyale.getName());
		System.out.println("Game Type: " + clashroyale.getGameType());
		System.out.println("Game Rating: " + clashroyale.getRate());
		System.out.println("Audience Score: " + clashroyale.getAudienceScore());

		System.out.println(clashroyale instanceof Multiplayer);
		System.out.println(clashroyale instanceof VideoGames);
		System.out.println(clashroyale instanceof MobileGames);
		System.out.println(clashroyale instanceof Strategy);
	}

}
