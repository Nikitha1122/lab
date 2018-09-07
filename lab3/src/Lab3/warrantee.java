package Lab3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class warrantee {
	public static void main(String[] args)
	{
		DateTimeFormatter fr=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("enter purchase date(DD/MM/YYYY):");
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		LocalDate start=LocalDate.parse(st,fr);
		System.out.println("enter warantee months:");
		int WarranteeMonths=sc.nextInt();
		System.out.println("enter warantee years:");
		int WarranteeYears=sc.nextInt();
		
		LocalDate m=start.plusMonths(WarranteeMonths);
		LocalDate y=m.plusYears(WarranteeYears);
		System.out.println(y);

}
}
