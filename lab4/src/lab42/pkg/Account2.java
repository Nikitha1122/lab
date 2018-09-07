package lab42.pkg;

import java.util.Scanner;

public class Account2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter withdraw amount from savings account:");
		String s=sc.next();
		double bal=Integer.parseInt(s);
		SavingsAccount sv=new SavingsAccount();
		sv.withdraw(bal);
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter deposit amount to current account:");
		String st=sc1.next();
		double bal1=Integer.parseInt(s);
		CurrentAccount cv=new CurrentAccount();
		cv.overdraft(bal1);
	}
	

	
}
