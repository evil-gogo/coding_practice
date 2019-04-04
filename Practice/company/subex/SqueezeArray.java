package subex;

import java.util.ArrayList;

public class SqueezeArray {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(7);
		list.add(7);
		list.add(7);
		list.add(8);
		list.add(8);
		list.add(9);
		
		squeezeArray(list);
	}
	
	private static void squeezeArray(ArrayList<Integer> list) {
		System.out.println(list);
		int count = 1;
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) == list.get(i + 1)) {
				count++;
				//System.out.println("i " + i + " i+1 " + (i + 1) + " count" + count);
			} else {
				count = 1;
			}
			if (count > 2) {
				//System.out.println("delete " + (i + 1));
				list.remove(i + 1);
				i = i - 1;
			}
		}
		System.out.println();
		System.out.println(list);
	}
}
