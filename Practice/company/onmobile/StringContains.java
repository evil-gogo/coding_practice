package onmobile;

public class StringContains {
	public static void main(String[] args) {
		String input = "Gagan Pal";
		String textContains = "Gagan is a good Boy Pal";


		/*String[] inputString = input.split(" ");
		int counter = 0;
		for (String string : inputString) {
			if (textContains.contains(string)) {
				counter++;
			}

			//System.out.println(string);
		}

		if (counter == inputString.length) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}*/
		//System.out.println();

		String[] sentences = {"how it was done", "are you how", "it goes to", "goes done are it"};

		String[] queries = {"done it", "it"};
		int [][] res = textQueries(sentences, queries);
		int res_rowLength = res.length;
		int res_colLength = res[0].length;
		for(int res_i=0; res_i < res_rowLength; res_i++) {
			for(int res_j=0; res_j < res_colLength; res_j++) {
				System.out.println(String.valueOf(res[res_i][res_j]) + " ");
			}
			System.out.println();
		}

	}



	static int[][] textQueries(String[] sentences, String[] queries) {
		int [][] array = new int [queries.length][sentences.length];
		for (int i = 0; i < queries.length; i++) {
			for (int j = 0; j < sentences.length; j++) {
				array[i][j] = -1;
			}
		}

		for (int queriesCounter = 0; queriesCounter < queries.length; queriesCounter++) {
			String[] stringQueriesSplit = queries[queriesCounter].split(" ");
			int []index = new int[sentences.length];
			int indexCounter = 0;
			for (int sentenceCounter = 0; sentenceCounter < sentences.length ; sentenceCounter++) {
				int counter = 0;	
				for (String token : stringQueriesSplit) {
					if (sentences[sentenceCounter].contains(token)) {
						counter++;
					}
				}
				if (counter == stringQueriesSplit.length) {
					index[indexCounter] = sentenceCounter; 
					array[queriesCounter][sentenceCounter] = 1;
				}
			}

		}
		return array;
	}



}


