package lab83.pkg;

public class RandomNumber implements Runnable {

	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		double x= 10* Math.random();
		//System.out.println(x);
		int number=(int) Math.abs(x);
		System.out.println(number);
		Factorial f=new Factorial(number);
		Thread t=new Thread(f);
		t.start();
	}

}
