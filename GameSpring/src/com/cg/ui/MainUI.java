package com.cg.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.cg.bean.Day;
import com.cg.bean.Game1;

import com.cg.dao.SportsRepo;
import com.cg.service.SportsService;
import com.cg.service.SportsServiceImpl;

public class MainUI {
	GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("BeanConfig.xml");
	SportsService service=ctx.getBean("service",SportsService.class);

		
		
		

	static Scanner sc=new Scanner(System.in);
	

	public static void main(String[] args) {
		
		
		MainUI m=new MainUI();
		
		String o="";
		while(true)
		{
			System.out.println("1.Store data");
			System.out.println("2.Display information of day");
			System.out.println("3.Dispaly information of Game1");
			System.out.println("enter choice");
			o=sc.nextLine();
			switch(o)
			{
			case "1":
				m.addData();
				break;
			case "2":
				m.retriveByDay();
				break;
			case "3":
				m.retriveByGame1();
				break;
			case "4":
				System.exit(0);
				break;
			}
		}
		
		
		

	}
	private void addData()
	{

		Day d1 = new Day();
		List<Game1> day1 = new ArrayList<Game1>();

		Game1 g11 = new Game1();
		g11.setName("Hockey");
		Game1 g12 = new Game1();
		g12.setName("Cricket");
		Game1 g13 = new Game1();
		g13.setName("Football");
		day1.add(g11);
		day1.add(g12);
		day1.add(g13);

		d1.setName("Day 1");
		d1.setGames(day1);

		Day dayName1=service.addDay(d1);
		System.out.println(dayName1.getName() + " Added");

		
		Day d2 = new Day();
		List<Game1> day2 = new ArrayList<Game1>();

		Game1 g21 = new Game1();
		g21.setName("Cricket");
		Game1 g22 = new Game1();
		g22.setName("hammer throw");
		Game1 g23 = new Game1();
		g23.setName("Volley Ball");
		Game1 g24 = new Game1();
		g24.setName("Tennis");
		day2.add(g21);
		day2.add(g22);
		day2.add(g23);
		day2.add(g24);

		d2.setName("Day 2");
		d2.setGames(day2);

		Day dayName2=service.addDay(d2);
		System.out.println(dayName2.getName() + " Added");


		
		Day d3 = new Day();
		List<Game1> day3 = new ArrayList<Game1>();

		Game1 g31 = new Game1();
		g31.setName("Badminton");
		Game1 g32 = new Game1();
		g32.setName("Throw Ball");
		Game1 g33 = new Game1();
		g33.setName("Cricket");
		Game1 g34 = new Game1();
		g34.setName("Tennis ");
		day3.add(g31);
		day3.add(g32);
		day3.add(g33);
		day3.add(g34);

		d3.setName("Day 3");
		d3.setGames(day3);

		Day dayName3=service.addDay(d3);
		System.out.println(dayName3.getName() + " Added");


		Day d4 = new Day();
		List<Game1> day4 = new ArrayList<Game1>();

		Game1 g41 = new Game1();
		g41.setName("Hockey");
		Game1 g42 = new Game1();
		g42.setName("Running");
		Game1 g43 = new Game1();
		g43.setName("Badminton");
		Game1 g44 = new Game1();
		g44.setName("Throw Ball");
		Game1 g45 = new Game1();
		g45.setName("Boxing ");
		Game1 g46 = new Game1();
		g46.setName("Kabbadi");

		day4.add(g41);
		day4.add(g42);
		day4.add(g43);
		day4.add(g44);
		day4.add(g45);
		day4.add(g46);

		d4.setName("Day 4");
		d4.setGames(day4);

		Day dayName4=service.addDay(d4);
		System.out.println(dayName4.getName() + " Added");


	}

	private void retriveByDay() {

		String dayName = "";
		System.out.println("Enter Day:");
		dayName = sc.nextLine();
		Day day = service.findByDay(dayName);
		System.out.println(day.getGames());

	}

	private void retriveByGame1() {

		String Game1Name = "";
		System.out.println("Enter Game1:");
		Game1Name = sc.nextLine();
		List<Day> dayList = service.findByGame(Game1Name);

		for (Day day : dayList) {
			System.out.println(day.getName());
		}
	}
}
