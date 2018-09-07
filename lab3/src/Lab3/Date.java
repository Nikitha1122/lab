package Lab3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date {
	public static void main(String[] args)
	{
		
	DateTimeFormatter fr=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	String date="21/06/1999";
	LocalDate dateNow=LocalDate.now();
	System.out.println(dateNow);
	Scanner sc=new Scanner(System.in);
	String e=sc.next();
	LocalDate end=LocalDate.parse(e,fr);
	LocalDate obj=LocalDate.parse(date,fr);
	System.out.println("converted obj is" +obj);
	Period p=Period.between(dateNow, end);
	System.out.println(p.getDays());
	System.out.println(p.getMonths());
	System.out.println(p.getYears());
	
	}
	
		
	}

