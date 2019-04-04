package thread;

public class ThreadDemoSingleRunnable {
	public static void main(String[] args) {

		Object lock = new Object();

		Runnable runnable = new Runnable() {
			boolean secondThreadRunning = false;
			int counter = 0;
			
			public void run() {
				while (counter < 20) {
					synchronized (lock) {
						if (!secondThreadRunning) {
							System.out.println(Thread.currentThread().getName());
							try {
								secondThreadRunning = true;
								counter++;
								lock.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						} else {
							secondThreadRunning = false;
							counter++;
							lock.notify();
						}

					}
				}
			}
		};


		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		thread1.setName("Goku");
		thread2.setName("Vegeta");
		thread1.start();
		thread2.start();
	}
}
