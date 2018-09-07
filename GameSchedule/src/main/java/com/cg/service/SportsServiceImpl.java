package com.cg.service;

import java.util.List;

import com.cg.bean.Day;
import com.cg.dao.SportsRepo;

public class SportsServiceImpl implements SportsService {
	private SportsRepo repo;

	
	public SportsServiceImpl(SportsRepo repo) {
		// TODO Auto-generated constructor stub
		this.repo = repo;
	}
	public SportsServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Day addDay(Day day) {
		// TODO Auto-generated method stub
		return repo.save(day);
	}

	@Override
	public Day findByDay(String name) {
		// TODO Auto-generated method stub
		return repo.findByDayName(name);
	}

	@Override
	public List<Day> findByGame(String name) {
		// TODO Auto-generated method stub
		return repo.findByGameName(name);
	}

}
	

	


