package goldmansachs;

import java.util.HashMap;
import java.util.Map;

public class MagicBar {
	public static void main(String[] args) {
		int[] array = {3, 1, 2, 2, 5, 6, 1, 1};

		findElement(array, array.length);
	}

	private static void findElement(int[] array, int size) {
		// TODO Auto-generated method stub
		boolean flag = false;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (hashMap.containsKey(array[i])) {
				hashMap.put(array[i], hashMap.get(array[i]) + 1 );
			} else {
				hashMap.put(array[i], 1);
			}
		}
		int maxCount = 0;
		for (Map.Entry<Integer, Integer> entrySet : hashMap.entrySet()) {
			System.out.println(entrySet.getKey() + " " + entrySet.getValue());
			if (isPrime(entrySet.getValue()) && entrySet.getValue() > maxCount) {
				flag = true;
				maxCount = entrySet.getValue();
			}
		}
		if (flag == true) {
			System.out.println(maxCount);
		}
	}

	private static boolean isPrime(int number) {
		// TODO Auto-generated method stub
		int m = number / 2;    
		for (int i = 2; i <=m; i++) {    
			if (number % i == 0){    
				return false;    
			}    
		}    
		return true;
	}  


}
