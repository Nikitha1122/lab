package lab62.pkg;

public class CurrentAccount extends Account {
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	double overdraftlimit=1_50_000;
	double currbal=10000;
	double rem;
	public void overdraft(double balance)
	{
		currbal+=balance;
		if(currbal>=overdraftlimit)
			System.out.println("limit reached");
		else
		{
			rem=overdraftlimit-currbal;
		}
	}
	public void detail()
	{
		System.out.println(" account holder details");
		System.out.println("Account holder name:" +person.getName());
		System.out.println("Account holder age :" +person.getAge());
		System.out.println("current account balance :" +currbal);
		System.out.println("overdraftlimit :" +overdraftlimit);
		System.out.println("remainig amount to be added:" +rem);
	}

}
