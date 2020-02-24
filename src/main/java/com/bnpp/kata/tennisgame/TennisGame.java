package com.bnpp.kata.tennisgame;

public class TennisGame {

	private Player firstPlayer;
	private Player secondPlayer;

	public TennisGame(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public String getScore() {

		String gameScore;

		if (firstPlayer.getPoints() == secondPlayer.getPoints()) {
			gameScore = firstPlayer.getScore() + " All";
		} else {
			gameScore = firstPlayer.getScore() + " " + secondPlayer.getScore();
		}
		return gameScore;
	}
}
