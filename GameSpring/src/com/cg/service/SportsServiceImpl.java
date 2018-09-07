package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Day;
import com.cg.dao.SportsRepo;
@Service(value="service")
public class SportsServiceImpl implements SportsService {
	
	@Autowired
	private SportsRepo repo;

	/*
	public SportsServiceImpl(SportsRepo repo) {
		
		this.repo = repo;
	}
	*/
	@Override
	@Transactional
	public Day addDay(Day day) {
		
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
	

	


