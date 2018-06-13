/**
 * @author avcbcoder
 * last modified @11-Jun-2018 @6:27:50 PM
 * GeeksClasses - Class_codes.lec_03_code_JAVA
 * TODO
 */
package Class_codes.lec_03_code_JAVA;

import java.util.Arrays;

public class MergeSortedArrays {
	public static void mergeTwoHalf(int A[]) {
		int n = A.length;
		int half_i = 0; // starting index of second half

		// Temp Array store sorted resultant array
		int temp[] = new int[n];

		// First Find the point where array is divide
		// into two half
		for (int i = 0; i < n - 1; i++) {
			if (A[i] > A[i + 1]) {
				half_i = i + 1;
				break;
			}
		}

		// If Given array is all-ready sorted
		if (half_i == 0)
			return;

		// Merge two sorted arrays in single sorted array
		int i = 0, j = half_i, k = 0;
		while (i < half_i && j < n) {
			if (A[i] < A[j])
				temp[k++] = A[i++];
			else
				temp[k++] = A[j++];
		}

		// Copy the remaining elements of A[i to half_! ]
		while (i < half_i)
			temp[k++] = A[i++];

		// Copy the remaining elements of A[ half_! to n ]
		while (j < n)
			temp[k++] = A[j++];

		for (i = 0; i < n; i++)
			A[i] = temp[i];
	}

	// Driver program to test above function
	public static void main(String[] args) {
		int A[] = { 2, 3, 8, -1, 7, 10 };
		mergeTwoHalf(A);

		// Print sorted Array
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
		System.out.println();
		// You can also print this way
		System.out.println(Arrays.toString(A));
	}
}
