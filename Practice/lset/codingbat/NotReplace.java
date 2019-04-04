package codingbat;

public class NotReplace {
	public static void main(String[] args) {
		String str = "is is test";
		//String str = "This is isabell";
		System.out.println(notReplace(str));
	}
	public static String notReplace(String str) {
		System.out.println(str.contains("\\s"));
		
		str = str.replace("[\\s*][^a-z*]is[\\s][^a-z*]", "is not");
		System.out.println(str);
		return str;
	}

}
