/**
 * @author avcbcoder
 * last modified @11-Jun-2018 @6:36:01 PM
 * GeeksClasses - Class_codes.lec_03_code_JAVA
 * TODO
 */
package Class_codes.lec_03_code_JAVA;

public class RowOfMaximum1s {
	// Function to find the index of first index
	// of 1 in a boolean array arr[]
	public static int find_first_position(int arr[], int low, int high) {
		if (high >= low) {
			// Get the middle index
			int mid = low + (high - low) / 2;

			// Check if the element at middle index is first 1
			if ((mid == 0 || arr[mid - 1] == 0) && arr[mid] == 1)
				return mid;

			// If the element is 0, recur for right side
			else if (arr[mid] == 0)
				return find_first_position(arr, (mid + 1), high);

			// If element is not first 1, recur for left side
			else
				return find_first_position(arr, low, (mid - 1));
		}
		return -1;
	}

	// Function that returns index of row
	// with maximum number of 1s.
	public static int rowWithMax1s(int mat[][], int R, int C) {
		// Initialize max values
		int max_row_index = 0, max = -1;

		// Traverse for each row and count number of 1s
		// by finding the index of first 1
		int i, index;
		for (i = 0; i < R; i++) {
			index = find_first_position(mat[i], 0, C - 1);
			if (index != -1 && C - index > max) {
				max = C - index;
				max_row_index = i;
			}
		}

		return max_row_index;
	}

	/// The main function that returns index of row with maximum number of 1s.
	public static int rowWithMax1s_new(int mat[][], int R, int C) {
		// Initialize first row as row with max 1s
		int max_row_index = 0;

		// The function first() returns index of first 1 in row 0.
		// Use this index to initialize the index of leftmost 1 seen so far
		int j = find_first_position(mat[0], 0, C - 1);
		if (j == -1) // if 1 is not present in first row
			j = C - 1;

		for (int i = 1; i < R; i++) {
			// Move left until a 0 is found
			while (j >= 0 && mat[i][j] == 1) {
				j = j - 1; // Update the index of leftmost 1 seen so far
				max_row_index = i; // Update max_row_index
			}
		}
		return max_row_index;
	}

	// Driver Code
	public static void main(String[] args) {
		int[][] mat = { { 0, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 0, 0 } };

		System.out.println("Index of row with maximum 1s is %d " + rowWithMax1s(mat, 4, 4));
		System.out.println(rowWithMax1s_new(mat, 4, 4));

	}
}
