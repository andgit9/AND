package Class_codes.lec_03_code_JAVA;

import java.util.Arrays;

/**
 * @author avcbcoder | last modified @11-Jun-2018 @5:59:06 PM | GeeksClasses -
 *         Class_codes.lec_03_code_JAVA
 */

public class AggressiveCows {
	public static void main(String[] args) throws Exception {
		// Positions of stalls
		int positions[] = { 1, 4, 3, 9, 8 };
		int c = 3; // No. of cows to be placed (2<=c<=n)
		Arrays.sort(positions);
		System.out.println("Largest minimum distance possible = " + ANS(positions, c));
	}

	// This function returns the maximum of minimum distance possible
	private static int ANS(int[] positions, int c) {
		int n = positions.length;
		// lets suppose lowest minimum distance to be 0
		int low = 0;
		// This is the maximum minimum distance possible
		// you can also take it as Integer.Max_value;
		int high = positions[n - 1];

		int ans = Integer.MIN_VALUE;

		while (low < high) {

			int mid = (low + high) / 2;
			// Now check wheather we can place cows with distance>= 'mid'

			if (isPossible(positions, c, mid)) {
				ans = Math.max(ans, mid);
				low = mid + 1;
			} else {
				high = mid;
			}
		}

		return ans;
	}

	private static boolean isPossible(int[] positions, int c, int distance) {
		// c is the number of cows to be placed and
		// distance is the minimum distance between two taken cows
		int cows = 1;// current no. of cows that have been placed
		int current_pos = positions[0]; // current position

		for (int i = 1; i < positions.length; i++) {
			// if difference between the two stall is greater than distance,
			// then only cow can be placed

			if (positions[i] - current_pos >= distance) {

				current_pos = positions[i];
				cows++;

				// if all cows are placed
				if (cows == c)
					return true;
			}
		}

		return false;
	}
}
