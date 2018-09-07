package lab_53;

abstract class Account {
	private long accnum;
	private double balance;
	private Person accholder;
	public long getAccnum() {
		return accnum;
	}
	public void setAccnum(long accnum) {
		this.accnum = accnum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccholder() {
		return accholder;
	}
	public void setAccholder(Person accholder) {
		this.accholder = accholder;
	}
	@Override
	public String toString() {
		return "Account [accnum=" + accnum + ", balance=" + balance
				+ ", accholder=" + accholder + "]";
	}
	public void deposit(double dep)
	{
		this.balance=dep+this.balance;
		System.out.println("after deposit balance" +this.balance);
	} 
	abstract void withdraw(double wit);

}
