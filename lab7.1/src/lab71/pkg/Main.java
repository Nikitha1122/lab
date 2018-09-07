package lab71.pkg;

import java.awt.List;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args)
	{
		ArrayOperation a=new ArrayOperation();
		ArrayList<Integer> l=new ArrayList<Integer>();
		ArrayList<Integer> ls=new ArrayList<Integer>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("enter elements in array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			l.add(arr[i]);
		}
		Collections.sort(l);
		
		for(Iterator itr=l.iterator();itr.hasNext();)
		{
			Integer val=(Integer) itr.next();
			int b=a.getSorted(val);
			ls.add(b);
		}
		System.out.println("Unsorted list: "+l);
		System.out.println("sorted list: " +ls);
				
	}

}
