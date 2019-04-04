package codingbat;

public class XYZThere {

	public static void main(String[] args) {
		System.out.println(xyzThere("abc.xyz"));
	}
	public static boolean xyzThere(String str) {
	
		int index = -1, prevIndex = 0, tempIndex = 0;
		boolean flagFound = false;
		for (int i = 1; i < str.length(); i++) {
			index = str.indexOf("xyz", i);
			if (index != -1) {
				tempIndex = index;
			}
			if (index != -1 && !flagFound) {
				flagFound = true;
				prevIndex = index;
			}
		}
		if (prevIndex != tempIndex) {
			return true;
		} 
		return false;
	}
}

