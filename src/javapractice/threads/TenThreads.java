package javapractice.threads;

public class TenThreads {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			Runnable r = new MyThread(i);
			Thread t = new Thread(r);
			t.start();
			System.out.print("Back to the main thread! <Wonder what's the value of i: " + i + "> \n");
		}
		System.out.println("main is going down guys :(");
	}

}
