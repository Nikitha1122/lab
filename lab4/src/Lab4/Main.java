package Lab4;

public class Main {
	public static void main(String[] args)
	{
		Person smith=new Person("smith",23);
		Person kathy=new Person("kathy",32);
		System.out.println(smith);
		System.out.println(kathy);
		Account acc=new Account();
		acc.setAccHolder(smith);
		acc.setBalance(200);
		acc.setDeposit(200);
		acc.setWithdraw(0);
		acc.getBalleft();
		
		Account acc1=new Account();
		acc1.setAccHolder(kathy);
		acc1.setBalance(400);
		acc1.setDeposit(400);
		acc1.setWithdraw(0);
		acc1.getBalleft();
		System.out.println(acc);
		System.out.println(acc1);
	}

}
