package lab72.pkg;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string(s1)");
		String s1=sc.nextLine();
		int n=s1.length();
		System.out.println("enter an other string with length lessthan" +n+ "(s2)");
		String s2=sc.nextLine();
		Operations o=new Operations();
		o.functions(s1, s2);

	}

}
