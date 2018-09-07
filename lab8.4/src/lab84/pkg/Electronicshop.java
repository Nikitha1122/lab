package lab84.pkg;

public class Electronicshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerItems c=new CustomerItems();
		Thread t1=new Thread(c);
		t1.start();

	}

}
