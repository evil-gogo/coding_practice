package timer;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	public static void main(String[] args) {
		final ArrayList<Integer> arrayList = new ArrayList<Integer>();

		Timer timer = new Timer();
		TimerTask timerTask = new TimerTask() {
			@Override
			public void run() {
				System.out.println("Inside Run");
				Random r = new Random();
				int i = r.nextInt(10 - 1) + 1;
				arrayList.add(i);
				System.out.println(arrayList);

				if (arrayList.size() > 10) {
					System.out.println("Cancel Timer");
					timer.cancel();
				}

			}
		};
		timer.schedule(timerTask, 500);
		timer.schedule(timerTask, 2000, 500);
	}
}
