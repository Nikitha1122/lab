package lab75.pkg;

import java.util.ArrayList;
import java.util.Collections;

public class lab7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> prod_names=new ArrayList<String>();
		prod_names.add("deodrant");
		prod_names.add("shampoo");
		prod_names.add("body lotion");
		prod_names.add("soaps");
		System.out.println("before sorting :" +prod_names );
		Collections.sort(prod_names);
		System.out.println("after sorting :");
		for(String string:prod_names)
		{
			System.out.println(" " +string);
		}
		

	}

}
