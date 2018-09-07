package lab_53;

public class Account_sub extends Account {
	public void withdraw(double wit)
	{
		setBalance(getBalance()-wit);
		System.out.println("after dseposit balance:" +getBalance());
	}

}
