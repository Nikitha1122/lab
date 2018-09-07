package lab62.pkg;

import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name");
		String n1=sc.nextLine();
		
		System.out.println("enter age");
		int age=sc.nextInt();
		
		Person p=new Person(n1,age);
		
		SavingsAccount sv = new SavingsAccount();
		try {
			if(age<15)
				throw new AgeNot15Exception();
			else{
				sv.setPerson(p);
				System.out.println("enter withdraw amount from savings account");
				String s=sc.next();
				double bal=Integer.parseInt(s);
				sv.withdraw(bal);
				sv.Details();
				
				Scanner sc2=new Scanner(System.in);
				System.out.println("enter deposit amount to current amount");
				String s1=sc2.next();
				double ball=Integer.parseInt(s1);
				CurrentAccount cv=new CurrentAccount();
				cv.overdraft(ball);
				cv.detail();
				
			}
			
		} catch (AgeNot15Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
	}
}
