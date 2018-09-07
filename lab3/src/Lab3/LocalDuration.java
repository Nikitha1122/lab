package Lab3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LocalDuration {
	public static void main(String[] args)
	{
		
		DateTimeFormatter fr=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("enter start date");
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		LocalDate start=LocalDate.parse(st,fr);
		System.out.println(start);
		
		System.out.println("enter end date");
		Scanner sv=new Scanner(System.in);
		String sr=sv.next();
		LocalDate end=LocalDate.parse(sr,fr);
		System.out.println(end);
		
		Period p=Period.between(start, end);
		
		System.out.println(p.getDays());
		System.out.println(p.getMonths());
		System.out.println(p.getYears());
	}
}
