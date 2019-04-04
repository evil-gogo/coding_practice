package sapient;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
 
	private String name = null;
	private BlockingQueue<String> blockingQueue;
 
	Producer(String name, BlockingQueue<String> sharedQueue) {
		this.name = name;
		this.blockingQueue = sharedQueue;
	}
 
	@Override
	public void run() {
		for (int i = 1; i <= 20; ++i) {
			try {
				blockingQueue.put("data " + String.valueOf(i));
				System.out.println(this.name + " Producing :" + " data " + String.valueOf(i));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
 
	}
 
}
 