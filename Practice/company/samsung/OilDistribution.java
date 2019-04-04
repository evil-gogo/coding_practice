package samsung;

public class OilDistribution {

	public static void main(String[] args) {
		//int[] oilmines = {6, 13, 10, 2};
		int[] oilmines = {6, 10, 13, 2};
		try {
			System.out.println("Difference " + minimumDifference(2, oilmines));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int minimumDifference(int n, int[] oilmines) throws Exception {
		if (oilmines != null && oilmines.length > 0 && n > 0) {
			int mediumMineValue = oilmines.length / n;
			int[] companyMineAllocation = new int[n];
			int j = 0;
			int maxallocation = 0, minallocation=0;
			for (int i = 0 ; i < n; i++) {
				companyMineAllocation[i] = 0;
				while (j < oilmines.length && companyMineAllocation[i] < mediumMineValue) {
					companyMineAllocation[i] += oilmines[j];
					j++;
				}
				if (j < oilmines.length) {
					if ((companyMineAllocation[i] - mediumMineValue) > (mediumMineValue - (companyMineAllocation[i] - oilmines[j-1]))) {
						companyMineAllocation[i] = companyMineAllocation[i]- oilmines[j-1];
					j--;
				}
			} else {
				if ((companyMineAllocation[i] - mediumMineValue) > (mediumMineValue - (companyMineAllocation[i] - oilmines[j - 1]))) {
					companyMineAllocation[i] = companyMineAllocation[i]- oilmines[j-1];
					j--;
				} else {
					break;
				}
			}
			if (companyMineAllocation[i] > maxallocation) {
				maxallocation = companyMineAllocation[i];
			}
			if (companyMineAllocation[i] < minallocation) {
				minallocation = companyMineAllocation[i];
			}
		}
		return maxallocation - minallocation;
	}
	throw new Exception("invalid input");
}
}