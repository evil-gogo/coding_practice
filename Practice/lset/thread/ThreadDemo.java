package thread;

public class ThreadDemo {


	public static void main(String[] args) {
		//Boolean lock = new Boolean(false);
		Object lock = new Object();
		Runnable runnable1 = new Runnable() {
			int counter1 = 0;
			@Override
			public void run() {
				synchronized (lock) {
					while (counter1 < 50) {
						System.out.println("0");
						counter1 = counter1 + 1;
						try {
							lock.wait();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						lock.notify();
						
					}


				}


			}
		};
		Thread thread1 = new Thread(runnable1);

		Runnable runnable2 = new Runnable() {
			int counter2 = 0;
			@Override
			public void run() {
				synchronized (lock) {
					while (counter2 < 50) {
						System.out.println("1");
						counter2 = counter2 + 1;
						lock.notify();
						try {
							lock.wait();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
				}
			}
		};
		Thread thread2 = new Thread(runnable2);

		thread1.start();
		thread2.start();
		
		/*thread2.start();
		thread1.start();*/
		
			

	}
}
