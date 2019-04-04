
package doha;

public class PrintEvenOddDemo {
    public static void main(String... args) {
        Printer print = new Printer();
        Thread thread1 = new Thread(new TaskEvenOdd(print, 10, false));
        Thread thread2 = new Thread(new TaskEvenOdd(print, 10, true));
        thread1.start();
        thread2.start();
    }

}

class TaskEvenOdd implements Runnable {

    private int max;
    private Printer print;
    private boolean isEvenNumber;

    TaskEvenOdd(Printer print, int max, boolean isEvenNumber) {
        this.print = print;
        this.max = max;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {
        int number = isEvenNumber == true ? 2 : 1;
        while (number <= max) {
            if (isEvenNumber) {
                print.printEven(number);
            } else {
               print.printOdd(number);
            }
            number += 2;
        }
    }
}

class Printer {
    boolean isOdd = false;
    synchronized void printEven(int number) {
        while (isOdd == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Counter value functionCount1 " + number);
        isOdd = false;
        notifyAll();
    }

    synchronized void printOdd(int number) {
        while (isOdd == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Counter value functionCount2 " + number);
        isOdd = true;
        notifyAll();
    }
}