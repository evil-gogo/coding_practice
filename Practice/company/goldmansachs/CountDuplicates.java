package goldmansachs;

import java.util.HashMap;

public class CountDuplicates {
	public static void main(String[] args) {
		String[][] matrix = {{"1", "a", "1", "2"}, 
				{"2", "b", "1", "e"},
				{"3", "c", "d", "f"}
		};
		System.out.println(findDuplicates(matrix));
		System.out.println(secureChannel(2, "oppeeennnn", "12"));
	}

	 static String secureChannel(int operation, String message, String key) {
		 return null;
	 }



	static int findDuplicates(String[][] matrix) {
		HashMap<String, Integer> map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (!map.containsKey(matrix[i][j]))
					map.put(matrix[i][j], 1);
				else {
					if (map.get(matrix[i][j]) == 1) {
						map.put(matrix[i][j], (map.get(matrix[i][j]) + 1));
						count++;
					}
				}
			}
		}
		return count;
	}
	
	
	
}