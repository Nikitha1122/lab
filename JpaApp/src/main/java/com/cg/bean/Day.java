package com.cg.bean;

import java.util.List;

public class Day {
	@Override
	public String toString() {
		return "Day [name=" + name + ", games=" + games + "]";
	}
	private String name;
	private List<Game> games;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Game> getGames() {
		return games;
	}
	public void setGames(List<Game> games) {
		this.games = games;
	}

}
