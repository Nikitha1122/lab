package Lab3;

import java.util.Scanner;

public class Checkpositive {
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	String str=sc.nextLine();
	sc.close();
	int j=str.length();
	int c=0;
	for(int i=0;i<j-1;i++)
	{
		if((str.charAt(i)-str.charAt(i+1))>0)
		{
			c=1;
			break;
		}
	}
		if(c!=1)
		{
			System.out.println("positive");
		}
		else
		{
			System.out.println("negative");
		}
	
}
}
