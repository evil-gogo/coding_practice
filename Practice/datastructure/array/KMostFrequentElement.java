package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;

public class KMostFrequentElement {
	public static void main(String[] args) {
		System.out.println("Program to Print K Most Frequent Elements");

		
		int[] array = {3, 1, 4, 4, 5, 5, 2, 6, 1, 5};
		int k = 2;
		
		//d is the distinct count of element
		System.out.println("\n\nMethod 1 \nTime Complexity O(dlogd) | Auxiliary Space O(d)");
		printKMostFrequentElementMethod1(array, k);
		
		System.out.println("\n\nMethod 2 \nTime Complexity O(dlogd) | Auxiliary Space O(d)");
		printKMostFrequentElementMethod2(array, k);
	}

	private static void printKMostFrequentElementMethod1(int[] array, int k) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (hashMap.containsKey(array[i])) {
				hashMap.put(array[i], hashMap.get(array[i]) + 1);
			} else {
				hashMap.put(array[i], 1);
			}
		}

		Set<Map.Entry<Integer, Integer>> entrySet = hashMap.entrySet();

		ArrayList<Map.Entry<Integer, Integer>> arrayList = new ArrayList<Map.Entry<Integer, Integer>> (entrySet);

		Collections.sort(arrayList, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> object1, Entry<Integer, Integer> object2) {
				// TODO Auto-generated method stub
				if (object2.getValue() == object1.getValue()) {
					return object2.getKey().compareTo(object1.getKey());
				} else {
					return object2.getValue().compareTo(object1.getValue());
				}
			}
		});

		for (int i = 0; i < k; i++) {
			System.out.println("Number - " + arrayList.get(i).getKey() + " | Frequency -  " + arrayList.get(i).getValue());	
		}
	}

	private static void printKMostFrequentElementMethod2(int[] array, int k) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (hashMap.containsKey(array[i])) {
				hashMap.put(array[i], hashMap.get(array[i]) + 1);
			} else {
				hashMap.put(array[i], 1);
			}
		}

		PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> object1, Entry<Integer, Integer> object2) {
				// TODO Auto-generated method stub
				if (object2.getValue() == object1.getValue()) {
					return object2.getKey().compareTo(object1.getKey());
				} else {
					return object2.getValue().compareTo(object1.getValue());
				}
			}
		});
		for (Map.Entry<Integer, Integer> entrySet : hashMap.entrySet()) {
			priorityQueue.offer(entrySet);
		}

		Map.Entry<Integer, Integer> entrySet;
		for (int i = 0; i < k; i++) {
			entrySet = priorityQueue.poll();
			System.out.println("Number - " + entrySet.getKey() + " | Frequency -  " + entrySet.getValue());	
		}
	}

}
