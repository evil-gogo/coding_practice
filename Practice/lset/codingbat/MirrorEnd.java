package codingbat;

public class MirrorEnd {
	public static void main(String[] args) {
		String string = "aba"; 
		System.out.println(mirrorEnds(string));
	}

	public static String mirrorEnds(String string) {
		String s = "";
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) == string.charAt(string.length() - i - 1)) {
				s = s + string.charAt(i);
			} else { 
				return s;
			}
		}
		return s;
	}


}
