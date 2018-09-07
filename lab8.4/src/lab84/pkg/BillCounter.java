package lab84.pkg;

public class BillCounter implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("billing person bills the product.");
		
	}
	

}
