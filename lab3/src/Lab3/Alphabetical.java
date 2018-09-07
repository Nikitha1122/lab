package Lab3;

import java.util.Scanner;

public class Alphabetical {
	public static void main(String[] args)
	{
		String temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of names ");
		int n=sc.nextInt();
		
		String name[]=new String[n];
		Scanner s=new Scanner(System.in);
		System.out.println("enter names");
		for(int x=0;x<n;x++)
			name[x]=s.next();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if((name[i].compareTo(name[j]))>0)
				{
					temp=name[i];
					name[i]=name[j];
					name[j]=temp;
				}
			}
		}
		System.out.println("sorted string name");
		for(int y=0;y<n;y++)
			System.out.println(name[y]+ "");
		for(int i=0;i<n;i++)
		{
			if(i<n/2)
				name[i]=name[i].toUpperCase();
			else
				name[i]=name[i].toLowerCase();
		}
				System.out.println("\n final array: ");
				for(int y=0;y<n;y++)
					System.out.println(name[y]+ "");
		
		
	}

}
