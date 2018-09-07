package Lab3;

import java.util.Scanner;

public class RegistrationForm {
	public static void main(String[] args)
	{
		System.out.println("enter the name");
		Scanner sc=new Scanner(System.in);
		String st1=sc.next();
		int len=st1.length();
		String st2="_job";
		String st3=st1.substring(len-1);
		if((len-4)>=8 && (st3.equals(st2)))
		{
			System.out.println("true");
			
		}
		else
		{
			System.out.println("false");
		}
	}

}
