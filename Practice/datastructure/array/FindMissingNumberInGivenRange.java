package array;

public class FindMissingNumberInGivenRange {
	public static void main(String[] args) {
		int[] array = {1, 2, 4, 5, 6};
		System.out.println("Missing Number is " + getMissingNumberMethod1(array));
		System.out.println("Missing Number is " + getMissingNumberMethod2(array));
	}
	
	private static int getMissingNumberMethod1(int[] array) {
	    int total, n;
	    n = array.length - 1;
	    total  = (n + 1) * (n + 2) / 2;   
	    for (int i = 0; i < n; i++) {
	       total -= array[i];
	    }
	    return total;
	}
	
	private static int getMissingNumberMethod2(int[] array) {
	    int x1 = array[0]; /* For xor of all the elements in array */
	    int x2 = 1; /* For xor of all the elements from 1 to n+1 */
	    int n = array.length - 1;
	    for (int i = 1; i< n; i++) {
	        x1 = x1 ^ array[i];
	    }
	            
	    for (int i = 2; i <= n+1; i++) {
	        x2 = x2 ^ i;         
	    }
	    
	    return (x1^x2);
	}
}