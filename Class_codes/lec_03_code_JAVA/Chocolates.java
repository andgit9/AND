/**
 * @author avcbcoder
 * last modified @11-Jun-2018 @6:22:20 PM
 * GeeksClasses - Class_codes.lec_03_code_JAVA
 * TODO
 */
package Class_codes.lec_03_code_JAVA;

import java.util.Arrays;

public class Chocolates {
	// Returns minimum difference between maximum
	// and minimum values of distribution.
	public static int findMinDiff(int arr[], int n, int no_of_students) {
		// if there are no chocolates or number
		// of students is 0
		if (no_of_students == 0 || n == 0)
			return 0;

		// Sort the given packets
		Arrays.sort(arr);
		System.out.println("Array after sorting : " + Arrays.toString(arr));
		// Number of students cannot be more than
		// number of packets
		if (n < no_of_students)
			return -1;

		// Largest number of chocolates
		int min_diff = Integer.MAX_VALUE;

		// Find the subarray of size m such that
		// difference between last (maximum in case
		// of sorted) and first (minimum in case of
		// sorted) elements of subarray is minimum.
		for (int i = 0; i + no_of_students - 1 < n; i++) {
			int diff = arr[i + no_of_students - 1] - arr[i];
			if (diff < min_diff) {
				min_diff = diff;
			}
		}
		return min_diff;
	}

	public static void main(String[] args) {
		int chocolate_packets[] = { 3, 4, 1, 9, 56, 7, 9, 12 };
		int n = 8;
		int no_of_students = 5; // Number of students

		System.out.println("Minimum difference is " + findMinDiff(chocolate_packets, n, no_of_students));
	}

}
