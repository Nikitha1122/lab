package lab42.pkg;


public class CurrentAccount extends Account2 {
	double overdraftLimit=15000;
	double currbal=10000;
	public void overdraft(double bal)
	{
		currbal+=bal;
		if(currbal>=overdraftLimit)
			System.out.println("Limit reached");
		else
		{
			double rem=overdraftLimit-currbal;
			System.out.println("amount that can be added to reach limit:" +rem);
		}
	}

}
