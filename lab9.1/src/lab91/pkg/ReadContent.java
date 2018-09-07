package lab91.pkg;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class ReadContent {
	public static void main(String[] args) throws IOException {
		ReadContent rc=new ReadContent();
		File file=new File("d:/lab9.1/source.txt");
		FileReader fr=new FileReader(file);
		FileWriter fw=new FileWriter("d:/lab9.1/target.txt");
		int len=(int) file.length();
		char[] arr=new char[len];
		char[] brr=new char[len];
		
		System.out.println("reading file");
		fr.read(arr);
		
		brr=rc.reverse(arr);
		System.out.println("writing file");
		fw.write(brr);
		
		System.out.println("file successfully written");
		fr.close();
		fw.close();
	
	}
	public char[] reverse(char[] c)
	{
		int n=c.length;
		char[] op=new char[n];
		for(int i=0;i<n;i++)
		{
			op[n-i-1]=c[i];
		}
		return op;
		
	}
	

}
