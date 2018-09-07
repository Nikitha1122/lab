package com.cg.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cg.bean.Day;
import com.cg.bean.Game;
@Repository
public class SportsRepoImpl implements SportsRepo {
     
	@Resource
	 private Map<String, Day> data;
	

	/*public SportsRepoImpl(Map<String, Day> data2) {
		// TODO Auto-generated constructor stub
		this.data=data2;
	}*/

	@Override
	public Day save(Day day) {
		// TODO Auto-generated method stub
		data.put(day.getName(), day);
		return day;
	}

	@Override
	public Day findByDayName(String name) {
		// TODO Auto-generated method stub
		if (data.containsKey(name)) {
			return data.get(name);
		} else {
			return null;
		}
	}

	@Override
	public List<Day> findByGameName(String name) {
		// TODO Auto-generated method stub

		List<Day> dayList = new ArrayList<Day>();
		for (Day day : data.values()) {
			List<Game> list = day.getGames();
			for (Game game : list) {
				/*System.out.println(game);
				System.out.println();*/
				if(game.getName().equals(name)){
					dayList.add(day);
				}
			}
		}
		return dayList;
	}

}
