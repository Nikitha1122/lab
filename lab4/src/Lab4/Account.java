package Lab4;

public class Account {
	private Person accHolder;
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public long getAccNum() {
		long accNum=(long)(12345678*Math.random());
		return accNum;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	private long accNum;
	private double balance;
	public double deposit;
	public double balleft;
	public double getBalleft()
	{
		double balleft=balance+deposit-withdraw;
		return balleft;
	}
	public void setBalleft(double balleft)
	{
		this.balleft=balleft;
	}
	public double getDeposit()
	{
		return deposit;
	}
	public void setDeposit(double deposit)
	{
		this.deposit=deposit;
	}
	public double getWithdraw()
	{
		return withdraw;
	}
	public void setWithdraw(double withdraw)
	{
		this.withdraw=withdraw;
	}
	public double withdraw;
	@Override
	public String toString() {
		return "Account [accHolder=" + accHolder + ", accNum=" + getAccNum()
				+ ", balance=" + balance + ", deposit=" + deposit
				+ ", balleft=" + balleft + ", withdraw=" + withdraw + "]";
	}
	

}
