package com.cg.ui;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.cg.AppConfig;
import com.cg.bean.Day;
import com.cg.bean.Game;
import com.cg.service.SportsService;

public class MainUI {
	/*
	 * Map<String,Day> data=new HashMap<String,Day>(); SportsRepo repo=new
	 * SportsRepoImpl(data); SportsService service=new SportsServiceImpl(repo);
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*GenericXmlApplicationContext contex = new GenericXmlApplicationContext("BeanConfig.xml");
		SportsService service = contex.getBean("service", SportsService.class);*/
		
		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(AppConfig.class);
		SportsService service = con.getBean("service", SportsService.class);
		
		
		Day d1 = new Day();
		List<Game> day1 = new ArrayList<Game>();

		Game g11 = new Game();
		g11.setName("Hockey");
		Game g12 = new Game();
		g12.setName("Cricket");
		Game g13 = new Game();
		g13.setName("Football");
		day1.add(g11);
		day1.add(g12);
		day1.add(g13);

		d1.setName("Day 1");
		d1.setGames(day1);

		Day dayName1 = service.addDay(d1);
		System.out.println(dayName1);

		Day d2 = new Day();
		List<Game> day2 = new ArrayList<Game>();

		Game g21 = new Game();
		g21.setName("Cricket");
		Game g22 = new Game();
		g22.setName("hammer throw");
		Game g23 = new Game();
		g23.setName("Volley Ball");
		Game g24 = new Game();
		g24.setName("Tennis");
		day2.add(g21);
		day2.add(g22);
		day2.add(g23);
		day2.add(g24);

		d2.setName("Day 2");
		d2.setGames(day2);

		Day dayName2 = service.addDay(d2);
		System.out.println(dayName2);

		Day d3 = new Day();
		List<Game> day3 = new ArrayList<Game>();

		Game g31 = new Game();
		g31.setName("Badminton");
		Game g32 = new Game();
		g32.setName("Throw Ball");
		Game g33 = new Game();
		g33.setName("Cricket");
		Game g34 = new Game();
		g34.setName("Tennis ");
		day3.add(g31);
		day3.add(g32);
		day3.add(g33);
		day3.add(g34);

		d3.setName("Day 3");
		d3.setGames(day3);

		Day dayName3 = service.addDay(d3);
		System.out.println(dayName3);

		Day d4 = new Day();
		List<Game> day4 = new ArrayList<Game>();

		Game g41 = new Game();
		g41.setName("Hockey");
		Game g42 = new Game();
		g42.setName("Running");
		Game g43 = new Game();
		g43.setName("Badminton");
		Game g44 = new Game();
		g44.setName("Throw Ball");
		Game g45 = new Game();
		g45.setName("Boxing ");
		Game g46 = new Game();
		g46.setName("Kabbadi");

		day4.add(g41);
		day4.add(g42);
		day4.add(g43);
		day4.add(g44);
		day4.add(g45);
		day4.add(g46);

		d4.setName("Day 4");
		d4.setGames(day4);

		Day dayName4 = service.addDay(d4);
		System.out.println(dayName4);

	}

}
