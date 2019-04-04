package accolite;

class MyThread implements Runnable {
	public void run() {
		Problem5_Test.obj.notify();
	}
}

public class Problem5_Test implements Runnable {
	public static Problem5_Test obj;
	private int data; 
	public Problem5_Test() {
		data = 10;
		
	}
	public void run() {
		obj = new Problem5_Test();
		obj.wait();
		obj.data += 20;
		System.out.println(obj.data);
	}
	
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Problem5_Test());
		Thread thread2 = new Thread(new MyThread());
		
		thread1.start();
		thread2.start();
		
		System.out.println("ACCOLITE");
	}
}