package goldmansachs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CodingWars {
	public static void main(String[] args) {
		int n = 5;
		int[] rating = {5, 2, 3, 1, 4};

		calculateCodingWars(rating, n);

	}
	
	private static void calculateCodingWars(int[] rating, int n) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < rating.length; i++) {
			hashMap.put(i, rating[i]);
		}

		Set<Map.Entry<Integer, Integer>> set = hashMap.entrySet();

		ArrayList<Map.Entry<Integer, Integer>> arrayList = new ArrayList<Map.Entry<Integer, Integer>> (set);

		Collections.sort(arrayList, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});


		int currMax = -1, currMaxIndex = -1;
		int currMin = -1, currMinIndex = -1;

		int mid = -1, midIndex = -1;
		for (int i = 0; i < arrayList.size(); i++) {
			currMax = arrayList.get(i).getValue();
			currMin = arrayList.get(n - 1 - i).getValue();
			currMaxIndex = arrayList.get(i).getKey();
			currMinIndex = arrayList.get(n - 1).getKey();
			for (int j = 1; j < arrayList.size() - 1; j++) {
				mid = arrayList.get(j).getValue();
				midIndex = arrayList.get(j).getKey();

				/*System.out.println("i = " + i + " j = " + j + "\n");
				System.out.println("Value " + currMax + ", " + mid + ", " + currMin);
				System.out.println("Index " + currMaxIndex + ", " + midIndex + ", " + currMinIndex);
				 */
				if ((currMax > mid && mid > currMin) && (currMaxIndex < midIndex && midIndex < currMinIndex)) {
					System.out.println("(" + currMax + "," + mid + "," + currMin + ")");
				}

			}
		}


		Collections.sort(arrayList, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});


		for (int i =  arrayList.size() - 1; i >= 0; i--) {
			currMax = arrayList.get(i).getValue();
			currMin = arrayList.get(arrayList.size() - 1 - i).getValue();
			currMaxIndex = arrayList.get(i).getKey();
			currMinIndex = arrayList.get(n - 1).getKey();
			for (int j = 1; j < arrayList.size() - 1; j++) {
				mid = arrayList.get(j).getValue();
				midIndex = arrayList.get(j).getKey();

				/*System.out.println("i = " + i + " j = " + j + "\n");
				System.out.println("Value " + currMin + ", " + mid + ", " + currMax);
				System.out.println("Index " + currMinIndex + ", " + midIndex + ", " + currMaxIndex);
				 */
				if ((currMax > mid && mid > currMin) && (currMaxIndex > midIndex && midIndex > currMinIndex)) {
					System.out.println("(" + currMin + "," + mid + "," + currMax + ")");
				}

			}
		}

	}
}
