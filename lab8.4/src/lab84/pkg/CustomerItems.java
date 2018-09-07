package lab84.pkg;

public class CustomerItems implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("customer giving the products");
		BillCounter b=new BillCounter();
		Thread t=new Thread(b);
		t.start();
		
	}
	

}
