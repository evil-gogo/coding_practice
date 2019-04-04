package array;

public class LostElementDuplicateArray {
	public static void main(String[] args) {
		int[] array1 = {1, 5, 3, 19, 18, 25};
		int[] array2 = {1, 5, 3, 18, 25};
		System.out.println("Minimum difference is " + findMissingElement(array1, array2));
	}
	
	private static int findMissingElement(int[] array1, int[]array2) {
		//Fails When Element 0 Exist in Array
		
		/*int missingElement = 0;
	    for (int i = 0; i < array1.length; i++)
	       missingElement = missingElement ^ array1[i];
	    */
	    
		int missingElement = array1[0];
	    for (int i = 1; i < array1.length; i++)
	       missingElement = missingElement ^ array1[i];
	    
	    
	    for (int j = 0; j < array2.length; j++)
	       missingElement = missingElement ^ array2[j];
		return missingElement;
	}
}