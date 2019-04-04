package goldmansachs;

public class SqueezeArray {
	public static void main(String[] args) {
		
		String[] arrayString = { "a", "a", "a", "a", "a", "b", "c", "d", "d", "d", "c", "c", "d" };
		getShrunkArray(arrayString, 3);
	}

	private static void getShrunkArray(String[] strArr, int burstLength) {
		String str = getStringFromStringArray(strArr);
		//System.out.println(str);
		String replaceString = "";
		for (char c = 97; c < 97 + 26; c++) {
			replaceString = "";
			//System.out.println(c);
			for (int i = 0; i < burstLength; i++) {
				replaceString = replaceString + "" + c;
			}
			//System.out.println(replaceString);
			
			
			str = squeeze(str, replaceString, "" + c);
		}
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println(str);
		
	}
	private static String squeeze(String str, String replaceString, String c) {
		String tempStr = str;
		str = str.replaceAll(replaceString, "" + c);
		if (tempStr.equals(str)) {
			//System.out.println("After Squeezing " + c + " " + tempStr);
			return tempStr;
		} else {
			return squeeze(str, replaceString, c);
		}
		
	}
	
	private static String getStringFromStringArray(String[] strArr) {
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < strArr.length; i++) {
		   strBuilder.append(strArr[i]);
		}
		return strBuilder.toString();
	}
}
