package lab83.pkg;

public class Factorial implements Runnable {
	int n;
	public Factorial(int n)
	{
		super();
		this.n=n;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println( "factorial of" +n+ "is :" +fact);

	}
	

}
