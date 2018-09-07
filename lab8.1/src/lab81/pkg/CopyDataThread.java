package lab81.pkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;

public class CopyDataThread implements Runnable{
	FileInputStream fis;
	
	public CopyDataThread(FileInputStream fis) {
		// TODO Auto-generated constructor stub
		this.fis=fis;
	}

	@Override
	public void run() {
		try
			{
			FileOutputStream fos=new FileOutputStream("d:/target.txt");
			byte[] buffer=new byte[fis.available()];
			fis.read(buffer);
			for(int i=0;i<buffer.length;i++)
			{
				fos.write(buffer[i]);
				if((i%10)==0)
				{
					System.out.println("10 characters copied successfully");
					Thread.sleep(5000);
				}
			}
			System.out.println("\n"+ "file copied successfully");
			fis.close();
			fos.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		
	}
}
	
	

