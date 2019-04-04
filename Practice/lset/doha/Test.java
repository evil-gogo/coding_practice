package doha;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
	public static void main(String[] args) {
		String[] wordArr = {"cat", "dog", "tac", "god", "act", "xyz"};
		printAnagramsTogether(wordArr);
	}

	private static void printAnagramsTogether(String[] wordArr) {
		String tempWordArr [] = new String[wordArr.length];

		for (int i = 0; i< wordArr.length; i++) {	
			tempWordArr[i] = sortString(wordArr[i]);
		}

		ArrayIndexComparator comparator = new ArrayIndexComparator(tempWordArr);
		Integer[] indexes = comparator.createIndexArray();
		Arrays.sort(indexes, comparator);

		for (int i = 0; i< wordArr.length; i++) {	
			System.out.print(wordArr[indexes[i]] + "  ");
		}
	}

	private static String sortString(String string) {
		char [] tempCharArray;
		tempCharArray= string.toCharArray();
		Arrays.sort(tempCharArray);
		return new String(tempCharArray);
	}
}

class ArrayIndexComparator implements Comparator<Integer> {
	private final String[] stringArray;

	public ArrayIndexComparator(String[] stringArray) {
		this.stringArray = stringArray;
	}

	public Integer[] createIndexArray() {
		Integer[] indexes = new Integer[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
			indexes[i] = i;
		}
		return indexes;
	}
	
	@Override
	public int compare(Integer index1, Integer index2) {
		return stringArray[index1].compareTo(stringArray[index2]);
	}
}