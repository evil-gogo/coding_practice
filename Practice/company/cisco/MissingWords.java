package cisco;

import java.util.ArrayList;

public class MissingWords {
	public static void main(String[] args) {
		String s = "a a a";//"I am using Hackerank to improve Programming";
		String t = "a";//am Hackerank to improve";
		//String t = " ";
		System.out.println(missingWords(s, t));
	}

	static String[] missingWords(String s, String t) {
		String[] s_split = s.split(" ");
		String[] t_split = t.split(" ");
		ArrayList<String> arrayList = new ArrayList<>();
		for (String sstring : s_split) {
			boolean flagContains = false;
			//String[] t_split = t_split2;
			
			for (int i = 0; i < t_split.length; i++) {
				if (t_split[i].equals(sstring)) {
					t_split[i]= "";
					flagContains = true;
					break;
				}

			}
			
			if (flagContains == false) {	
				arrayList.add(sstring);
			}
		}
		
		String[] stringArr = new String[arrayList.size()];
		stringArr = arrayList.toArray(stringArr);
		System.out.println(arrayList);
		return stringArr;


	}
}
