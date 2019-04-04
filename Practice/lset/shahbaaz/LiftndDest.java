package shahbaaz;

import java.util.HashSet;
import java.util.Scanner;

public class LiftndDest {
	static int []lifts;
	static Scanner sc;
	static int pep;
	static int[] cur_fl;
	static int[] dest;
	static int a,b;
	static int[] pep_in;
	static int pw_con;
	static int tt;

	public static void main(String[] args) {

		int iup, idn;
		int il, il2;
		sc = new Scanner(System.in);
		pep_in = new int[10];
		lifts = new int[10];
		for (int i = 0; i < 10; i++) {
			lifts[i] = sc.nextInt();
		}

		pep = sc.nextInt();
		cur_fl = new int[pep];
		dest = new int[pep];
		for (int i = 0; i < pep; i++) {
			cur_fl[i] = sc.nextInt();
			dest[i] = sc.nextInt();
		}
		a = sc.nextInt();
		b = sc.nextInt();
		
		iup = gogUp(cur_fl,dest);
		int iup_old = -1;
		int dest_up = 0;
		int cur_up = 0;
		int dest_dn = 0;
		int cur_dn = 0;
		int idn_old = -1;
		idn = gogDown(cur_fl,dest);
		while (iup != -1) {
			if (iup_old == -1) {
				int temp_pw = 0;
				int temp = 0;
				il = nearest(lifts, cur_fl[iup]);
				if (lifts[il] != cur_fl[iup]) {
					pw_con = pw_con + Math.abs(cur_fl[iup] - lifts[il]);
				}

				pw_con = pw_con + a + (dest[iup] - cur_fl[iup]) * b;
				tt = tt + 1;

				int[] temp_a = new int[pep * 2];
				int temp_in = 0;

				dest_up = dest[iup];
				cur_up = cur_fl[iup];

				int diff = dest[iup] - cur_fl[iup];

				for (int i = 0; i < pep; i++) {
					if (cur_fl[i] >= cur_up && dest[i] <= dest_up && dest[i] - cur_fl[i] > 0) {
						temp_a[temp_in] = cur_fl[i];
						temp_in++;
						temp_a[temp_in] = dest[i];
						temp_in++;
						cur_fl[i] = -1;
						dest[i] = -1;
					}
				}

				int count = countDistinct(temp_a); 
				System.out.println(count);

				tt=tt + 2 * count;

				tt = tt - 2 + diff - (count - 1);
				pw_con = pw_con + (count - 1) * b;
				iup_old = iup;
				iup = gogUp(cur_fl, dest);
			} else {
				if (dest[iup] < cur_up - 1 || cur_fl[iup] > dest_up - 1) {
					int temp_pw = 0;
					int temp = 0;
					il = nearest(lifts, cur_fl[iup]);
					if (lifts[il] != cur_fl[iup]) {
						pw_con = pw_con + Math.abs(cur_fl[iup] - lifts[il]);
					}
					pw_con = pw_con + a + (dest[iup] - cur_fl[iup]) * b;
					tt = tt + 1;
					int[] temp_a = new int[pep * 2];
					int temp_in = 0;
					dest_up = dest[iup];
					cur_up = cur_fl[iup];
					int diff = dest[iup] - cur_fl[iup];
					for (int i = 0; i < pep; i++) {
						if (cur_fl[i] >= cur_up && dest[i] <= dest_up && dest[i] - cur_fl[i] > 0) {
							temp_a[temp_in] = cur_fl[i];
							temp_in++;
							temp_a[temp_in] = dest[i];
							temp_in++;
							cur_fl[i] = -1;
							dest[i] = -1;
						}
					}

					int count = countDistinct(temp_a);
					System.out.println(count);
					tt = tt + 2 * count;
					tt = tt - 2 + diff - (count - 1);
					pw_con = pw_con + (count - 1) * b;
					iup_old = iup;
					iup = gogUp(cur_fl, dest);
				}

				if (cur_fl[iup] < cur_up && dest[iup] >= cur_up - 1 || cur_fl[iup] <= dest_dn && dest[iup] >= dest_dn) {
					int diff = 0;
					int temp_pw = 0;
					int temp = 0;
					il = nearest(lifts, cur_fl[iup]);
					if (lifts[il] != cur_fl[iup]) {
						pw_con = pw_con + Math.abs(cur_fl[iup] - lifts[il]);
					}
					if (cur_fl[iup] - cur_up > 0) {
						pw_con = pw_con + (cur_fl[iup] - cur_up) * b;
						diff = cur_fl[iup] - cur_up;
					} else {
						pw_con = pw_con + (dest_up - dest[iup]) * b;
						diff = dest_up - dest[iup];
					}
					int[] temp_a = new int[pep * 2];
					int temp_in = 0;
					dest_up = dest[iup];
					cur_up = cur_fl[iup];
					for (int i = 0; i < pep; i++) {
						if (cur_fl[i] >= cur_up && dest[i] <= dest_up && dest[i] - cur_fl[i] > 0) { 
							temp_a[temp_in] = cur_fl[i];
							temp_in++;
							temp_a[temp_in] = dest[i];
							temp_in++;
							cur_fl[i] = -1;
							dest[i] = -1;
						}
					}
					int count = countDistinct(temp_a);
					tt = tt + 2 * count;
					tt = tt - 2 + diff - (count - 1);
					pw_con = pw_con + (count - 1) * b;
					iup_old = iup;
					iup = gogUp(cur_fl, dest);
				}
			}
		}
		while (idn != -1) {
			if (idn_old == -1) {
				int temp = 0;
				il2 = nearest(lifts, cur_fl[idn]);
				if (lifts[il2] != cur_fl[idn]) {
					pw_con = pw_con + Math.abs(cur_fl[idn] - lifts[il2]);
				}
				pw_con = pw_con + a + (cur_fl[idn] - dest[idn]) * b;
				tt = tt + 1;
				int[] temp_a = new int[pep * 2];
				int temp_in = 0;
				dest_dn = dest[idn];
				cur_dn = cur_fl[idn];
				int diff = cur_fl[idn] - dest[idn];
				for (int i = 0; i < pep; i++) {
					if (cur_fl[i] <= cur_dn && dest[i] >= dest_dn && cur_fl[i] - dest[i] > 0) {
						temp_a[temp_in] = cur_fl[i];
						temp_in++;
						temp_a[temp_in] = dest[i];
						temp_in++;
						cur_fl[i] = -1;
						dest[i] = -1;
					}
				}

				int count = countDistinct(temp_a);
				tt = tt + 2 * count;
				tt = tt - 2 + (diff) - (count - 1);
				pw_con = pw_con + (count - 1) * b;
				idn_old = idn;
				idn = gogDown(cur_fl, dest);
			} else {
				if (cur_fl[idn] < dest_dn - 1 || dest[idn] > cur_dn - 1) {
					int temp = 0;
					il2 = nearest(lifts, cur_fl[idn]);
					if (lifts[il2] != cur_fl[idn]) {
						pw_con = pw_con + Math.abs(cur_fl[idn] - lifts[il2]);
					}
					pw_con = pw_con + a + (cur_fl[idn] - dest[idn]) * b;
					tt = tt + 1;
					int[] temp_a = new int[pep * 2];
					int temp_in = 0;
					dest_dn = dest[idn];
					cur_dn = cur_fl[idn];
					int diff = cur_fl[idn] - dest[idn];
					for (int i = 0; i < pep; i++) {
						if (cur_fl[i] <= cur_dn && dest[i] >= dest_dn && cur_fl[i] - dest[i] > 0) {
							temp_a[temp_in] = cur_fl[i];
							temp_in++;
							temp_a[temp_in] = dest[i];
							temp_in++;
							cur_fl[i] = -1;
							dest[i] = -1;
						}
					}
					int count = countDistinct(temp_a);
					tt = tt + 2 * count;
					tt = tt - 2 + (diff) - (count - 1);
					pw_con = pw_con + (count - 1) * b;
					idn_old = idn;
					idn = gogDown(cur_fl, dest);
				}
				if (cur_fl[idn] > cur_dn && dest[idn] >= cur_dn - 1 || cur_fl[idn] < cur_dn && dest[idn] < dest_dn) {
					int diff = 0;
					int temp_pw = 0;
					int temp = 0;
					il = nearest(lifts, cur_fl[idn]);
					if (lifts[il] != cur_fl[idn]) {
						pw_con = pw_con+Math.abs(cur_fl[idn] - lifts[il]);
					}
					if (cur_dn-cur_fl[idn] > 0) {
						pw_con = pw_con + (dest_dn - dest[idn]) * b;
						diff = dest_dn - dest[idn];
					} else {
						pw_con = pw_con + (cur_dn - cur_fl[idn]) * b;
						diff = cur_dn - cur_fl[idn];
					}
					int[] temp_a = new int[pep * 2];
					int temp_in = 0;
					dest_dn = dest[idn];
					cur_dn = cur_fl[idn];
					for (int i = 0; i < pep; i++) { 
						if (cur_fl [i] <= cur_dn && dest[i] >= dest_dn && cur_fl[i] - dest[i] > 0) {
							temp_a[temp_in] = cur_fl[i];
							temp_in++;
							temp_a[temp_in] = dest[i];
							temp_in++;
							cur_fl[i] = -1;
							dest[i] = -1;
						}
					}
					int count = countDistinct(temp_a);
					tt = tt + 2 * count;
					tt = tt - 2 + (diff) - (count - 1);
					pw_con = pw_con + (count - 1) * b;
					idn_old = idn;
					idn = gogDown(cur_fl, dest);
				}
			}
		}
		System.out.println("Output:");
		System.out.println(tt);
		System.out.println(pw_con);
	}

	private static int min(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	private static int max(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	private static int gogDown(int[] array , int[] array2) {
		int max = array[0]-array2[0];
		int index = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i]-array2[i] > max) {
				max = array[i]-array2[i];
				index=i;
			}
		}
		if (max > 0)
			return index;
		return -1;
	}

	private static int gogUp(int[] array , int[] array2) {
		int max = array2[0] - array[0];
		int index = 0;
		for (int i = 1; i < array.length; i++) {
			if (array2[i] - array[i] > max) {
				max = array[i] - array2[i];
				index = i;
			}
		}
		if (max > 0)
			return index;
		return -1;
	}
	
	private static int nearest(int[] numbers, int val) {
		int myNumber = val;
		int distance = Math.abs(numbers[0] - myNumber);
		int idx = 0;

		for (int c = 1; c < numbers.length; c++) {
			int cdistance = Math.abs(numbers[c] - myNumber);
			if (cdistance < distance){
				idx = c;
				distance = cdistance;
			}
		}
		return idx;
	}

	static int countDistinct(int arr[]) {
		int count = 0;
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (!set.contains(arr[i])) {
				set.add(arr[i]);
				count++;
			}
		}
		return count;
	}

}


