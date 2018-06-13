/**
 * @author avcbcoder
 * last modified @11-Jun-2018 @11:18:02 PM
 * GeeksClasses - Class_codes.lec_04_code_JAVA
 * TODO
 */
package Class_codes.lec_04_code_JAVA;

import java.util.HashSet;

public class DistinctCandies {

	// Given an array, where every element of array denotes
	// the type of candy. You have to distribute these candies
	// between brother & sister such that the number of candies
	// are equal and sister gets maximum different kinds of candies.

	public static int distributeCandies(int candies[]) {
		// Find unique candies
		HashSet<Integer> unique = new HashSet<>();
		for (int i = 0; i < candies.length; i++)
			unique.add(candies[i]);
		int x = unique.size();
		// since we need to divide equally so we can not give
		// more than n/2 candies to girl
		return Math.min(candies.length / 2, x);
	}

	public static void main(String... s) {
		int arr[] = { 1, 1, 1, 1, 1, 2, 4, 5 };
		System.out.println(distributeCandies(arr));
	}
}
