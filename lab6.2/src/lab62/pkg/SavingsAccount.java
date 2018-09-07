package lab62.pkg;

public class SavingsAccount extends Account {
	private Person person;
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	final double minbal = 500.0;
	double balance = 15_00_000.0;

	public void withdraw(double amount) {
		if (balance < minbal)
			System.out.println("cannot withdraw");
		else {
			balance -= amount;
		}
	}

	public void Details() {
		System.out.println(" account holder details");
		System.out.println("Account holder name:" + person.getName());
		System.out.println("Account holder age :" + person.getAge());
		System.out.println("savings account balance :" + balance);
	}

	/*
	 * public SavingsAccount() { super(); // TODO Auto-generated constructor
	 * stub }
	 */
}
