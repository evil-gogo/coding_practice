package calender;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Calender {
	public static void main(String[] args) {
		Calendar calendar1 = Calendar.getInstance();
		Calender calender2 = new Calender();
		System.out.println(calendar1.get(calendar1.DATE));
		System.out.println(calendar1.get(calendar1.MONTH) +  1);
		System.out.println(calendar1.get(calendar1.YEAR) +  " " + calendar1.get(calendar1.MONTH) + " " +  calendar1.get(calendar1.DATE));
		System.out.println(calendar1.get(calendar1.WEEK_OF_MONTH));
		//System.out.println(calendar2..get(calendar2.DATE));
		calendar1.getClass().getName();	

	}
}
