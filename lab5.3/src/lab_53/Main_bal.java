package lab_53;

public class Main_bal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("smith",23);
		Account ac=new Account_sub();
		ac.setAccholder(p);
		ac.setBalance(2000);
		System.out.println(ac);
		ac.deposit(2000);
		
		Person p1=new Person("kathy",23);
		Account ac1=new Account_sub();
		ac1.setAccholder(p1);
		ac.setBalance(3000);
		System.out.println(ac);
		ac.withdraw(2000);

	}

}
