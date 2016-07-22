package javapractice.threads;

public class MyThread implements Runnable {
	
	int number;
	
	MyThread (int number) {
		this.number = number;
	}
	
	@Override
	public void run() {
		System.out.println("I am thread number " + number + "	 Oh yeah!\n");
	}

}
