package lab82.pkg;

public class Timer implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer t = new Timer();
		Thread th = new Thread(t);
		System.out.println("timer starts");
		th.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			if (count == 10) {
				System.out.println("timer restarting");
				count = 0;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			count++;
		}
	}

}
