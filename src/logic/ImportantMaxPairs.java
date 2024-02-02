package logic;

import java.util.Arrays;

public class ImportantMaxPairs {
	public static int maxPairs(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);

		int maxPairs = 0;
		int i = 0, j = 0;

		while (i < a.length && j < b.length) {
			if (a[i] > b[j]) {
				maxPairs++;
				i++;
				j++;
			} else {
				i++;
			}
		}

		return maxPairs;
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7 };
		int[] b = { 2, 4, 6, 8 };
		System.out.println("Maximum number of pairs: " + maxPairs(a, b)); // Output: 4
	}
}