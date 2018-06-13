/**
 * @author avcbcoder
 * last modified @11-Jun-2018 @6:32:12 PM
 * GeeksClasses - Class_codes.lec_03_code_JAVA
 * TODO
 */
package Class_codes.lec_03_code_JAVA;

import java.util.Arrays;

public class MinPlatformNeeded {// Returns minimum number of platforms reqquired
	public static int find_minimum_platform(int arr[], int dep[]) {
		int n = arr.length;// both arrays have same size
		// Sort arrival and departure arrays
		Arrays.sort(arr);
		Arrays.sort(dep);

		// plat_needed indicates number of platforms
		// needed at a time
		int plat_needed = 1, result = 1;
		int i = 1, j = 0;

		// Similar to merge in merge sort to process
		// all events in sorted order
		while (i < n && j < n) {
			// If next event in sorted order is arrival,
			// increment count of platforms needed
			if (arr[i] <= dep[j]) {
				plat_needed++;
				i++;

				// Update result if needed
				if (plat_needed > result)
					result = plat_needed;
			}

			// Else decrement count of platforms needed
			else {
				plat_needed--;
				j++;
			}
		}

		return result;
	}

	// Driver program to test methods of graph class
	public static void main(String[] args) {
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
		System.out.println("Minimum Number of Platforms Required = " + find_minimum_platform(arr, dep));
	}
}
