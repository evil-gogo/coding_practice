package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrangeNumbersToFormBiggestNumber {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();

		//output should be 6054854654
/*		arrayList.add("54");
		arrayList.add("546");
		arrayList.add("548");
		arrayList.add("60");
*/
		// output should be 777776
		/*arrayList.add("7");
	    arrayList.add("776");
	    arrayList.add("7");
	    arrayList.add("7");*/

		//output should be 998764543431
		arrayList.add("1");
	    arrayList.add("34");
	    arrayList.add("3");
	    arrayList.add("98");
	    arrayList.add("9");
	    arrayList.add("76");
	    arrayList.add("45");
	    arrayList.add("4");
		 

		System.out.println("Biggest Number is ");
		printLargest(arrayList);
	}

	public static class MyComparator implements Comparator<String>  {
		@Override
		public int compare(String X, String Y) {
			String XY = X.concat(Y);
			String YX = Y.concat(X);
			return YX.compareTo(XY);			
		}
	}

	private static void printLargest(ArrayList<String> arrayList) {
		for (int i = 0; i < arrayList.size() ; i++ )
			System.out.print(arrayList.get(i));
		
		System.out.println(" ");
		Collections.sort(arrayList, new MyComparator());
		for (int i = 0; i < arrayList.size() ; i++ )
			System.out.print(arrayList.get(i));
	}
}