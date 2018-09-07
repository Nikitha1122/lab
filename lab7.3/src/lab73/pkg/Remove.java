package lab73.pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remove {
	public static void main(String[] args) {
		
	
	
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(2);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		System.out.println("List 1:"+l1);
		List<Integer> l2=new ArrayList<Integer>();
		
		l2.add(2);
		l2.add(1);
		l2.add(7);
		l2.add(9);
		
		System.out.println("List 2:"+l2);
		l1.removeAll(l2);
		
		System.out.println(l1);
		
	
	}
	}


