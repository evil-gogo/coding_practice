package accolite;

public class Problem19_Test implements Runnable {
	public void run() {
		System.out.println("ACC");
		System.out.println("Accoliteffff");
	}
	public static void main(String[] args) {
		Problem19_Test obj = new Problem19_Test();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.println("Accolite");
		try {
			thread.join();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("for");
	}
}