package lab61.pkg;

import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter full name");
		String name=s.nextLine();
		
		System.out.println("enter gender");
		char g=s.next().charAt(0);
		
		String[] n=name.split(" ");
		
		Person p=new Person();
		
		try
		{
		if(n.length==1)
				throw new FirstLastnameBlankException();
			else
			{
				p.setFname(n[0]);
				p.setLname(n[1]);
				p.setGender(g);
				p.Details();
			}
		}
		catch(FirstLastnameBlankException e)
		{
			System.out.println(e);
		}
		

	}

}
