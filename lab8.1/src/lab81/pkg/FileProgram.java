package lab81.pkg;

import java.io.FileInputStream;
import java.io.IOException;

public class FileProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("d:/test.txt");
		Thread t1=new Thread(new CopyDataThread(fis));
		t1.start();
	
   
	}

}
