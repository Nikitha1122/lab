package com.cg.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Day {
	
	@Override
	public String toString() {
		return "Day [name=" + name + ", games=" + games + "]";
	}
	
	
	@Id
	@GeneratedValue
	private int dayId;
	
	private String name;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Game1> games;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Game1> getGames() {
		return games;
	}
	public void setGames(List<Game1> games) {
		this.games = games;
	}

}
