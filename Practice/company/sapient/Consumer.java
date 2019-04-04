package sapient;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private String name = null;
	private BlockingQueue<String> blockingQueue;
 
	Consumer(String name, BlockingQueue<String> sharedQueue) {
		this.name = name;
		this.blockingQueue = sharedQueue;
	}
 
	@Override
	public void run() {
		for (int i = 1; i <= 20; ++i) {
			try {
				String value = blockingQueue.take();
				System.out.println("\t" + this.name + " Consuming : " + value);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}