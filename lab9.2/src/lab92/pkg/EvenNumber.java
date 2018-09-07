package lab92.pkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) throws IOException {
		FileInputStream in=new FileInputStream("d:/numbers.txt");
		Scanner sc=new Scanner(in);
		sc.useDelimiter(",");
		while(sc.hasNextInt())
		{
		
			int i=sc.nextInt();
			
				if(i%2==0)
				{
			System.out.println(i);
		}
			
	}

}
}
