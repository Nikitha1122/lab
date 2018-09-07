package lab42.pkg;



public class SavingsAccount extends Account2 {
	final double minbal=500.0;
	double bal=150000.0;
	public SavingsAccount()
	{
		
	}
	public void withdraw(double amount)
	{
		if(bal<minbal)
		{
			System.out.println("can't withdraw, minimum bal reached");
		}
		else
		{
			bal-=amount;
			System.out.println("balance after withdraw  :" +bal);
		}
	}
	

}
