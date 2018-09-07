package lab83.pkg;

public class Main {
	public static void main(String[] args) {
		RandomNumber r=new RandomNumber();
		Thread t1=new Thread(r);
		System.out.println("thread starts");
		t1.start();
	}

}
