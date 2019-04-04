package appnomic;
public class Synch {
    // Sleeps for 5 seconds
	
    private static void do_stuff() {
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {}
    }
    public synchronized static void m1() {
        do_stuff();
    }
    public synchronized static void m2() {
        do_stuff();
    }
    public static void main(String[] args) {
        Thread t1 = new Thread() {
                public void run() {
                    Synch s = new Synch();
                    s.m1();
                }
            };
        Thread t2 = new Thread() {
                public void run() {
                    Synch s = new Synch();
                    s.m2();
                }
            };
        t1.start();
        t2.start();
        System.out.println("Done");
    }
}


/*package appnomic;

public class Task implements Runnable {
    private void do_stuff() {
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {}
    }
    public void run() {
        do_stuff();
    }

    static public void main(String[] args) {
    	long t1 = System.currentTimeMillis();
        Thread[] task_array = {new Thread(new Task()),
                               new Thread(new Task()),
                               new Thread(new Task()),
                               new Thread(new Task())};
        task_array[0].start();
        task_array[1].start();
        task_array[2].start();
        task_array[3].start();
        long t2 = System.currentTimeMillis();
        System.out.println("Done " + (t2 - t1));
    }
}*/