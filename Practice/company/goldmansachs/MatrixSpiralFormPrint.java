package goldmansachs;

public class MatrixSpiralFormPrint {
	public static void main(String[] args) {
		int[][] matrix = { {1,  2,  3,  4,  5,  6},
				{7,  8,  9,  10, 11, 12},
				{13, 14, 15, 16, 17, 18}};

		System.out.println(spiralPrint(matrix));
	}

	private static String spiralPrint(int[][] matrix) {
		if (matrix != null && matrix.length < 1) {
			return "[]";	
		}
		
		int i, k = 0, l = 0, m = matrix.length, n = matrix[0].length;
		String string = new String();

		while (k < m && l < n) {
			for (i = l; i < n; ++i) {
				//System.out.print(matrix[k][i] + " ");
				string = string + matrix[k][i] + " ";
			}
			k++;

			for (i = k; i < m; ++i)	{
				//System.out.print(matrix[i][n - 1] + " ");
				string = string + matrix[i][n - 1] + " ";
			}
			n--;

			if ( k < m) {
				for (i = n - 1; i >= l; --i) {
					//System.out.print(matrix[m - 1][i] + " ");
					string = string + matrix[m - 1][i] + " ";
				}
				m--;
			}

			if (l < n) {
				for (i = m - 1; i >= k; --i) {
					//System.out.print(matrix[i][l] + " ");
					string = string + matrix[i][l] + " ";
				}
				l++;    
			}        
		}
		
		return "[" + string.trim() + "]";
	}
}