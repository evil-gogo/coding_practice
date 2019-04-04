package threadprioritybasic;
class Aone implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}   
}

public class Test {		
	public static void main(String... args) {	
		Aone a = new Aone();
		Thread t = new Thread(a);
		Thread t1 = new Thread(a);		
		t.setName("t");
		t1.setName("t1");
		t.setPriority(10);
		t1.setPriority(-1); //1 to 10 only allowed 
		t.start();
		t1.start();
		
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);		
	}
}
