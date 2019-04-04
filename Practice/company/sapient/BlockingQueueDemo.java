package sapient;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueDemo {
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<String> sharedBlockingQueue = new LinkedBlockingQueue<String>(1);
		Runnable producer = new Producer("Producer", sharedBlockingQueue);
		Runnable consumer = new Consumer("Consumer", sharedBlockingQueue);

		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);

		producerThread.start();
	
		Thread.sleep(1000); //Let Producer Produce Something
		
		consumerThread.start();
	}
}