/**
 * @author avcbcoder
 * last modified @11-Jun-2018 @10:08:14 PM
 * GeeksClasses - Class_codes.lec_04_code_JAVA
 * TODO
 */
package Class_codes.lec_04_code_JAVA;

import java.util.Arrays;

public class AnagramStrings {

	// It uses sorting to check anagram
	public static boolean anagram_sort(String a, String b) {
		if (a.length() != b.length())
			return false;
		// It is a way to convert string to character array
		char[] A = a.toCharArray();
		// This method will sort the array in alphabetical order
		Arrays.sort(A);
		// convert the character array back to string
		a = String.valueOf(A);

		char[] B = b.toCharArray();
		Arrays.sort(B);
		b = String.valueOf(B);

		// This method returns true if two strings are exactly same
		if (a.equals(b)) {
			return true;
		} else {
			return false;
		}
	}

	// It uses frequency array to compare two strings
	public static boolean anagram_freq(String a, String b) {
		if (a.length() != b.length())
			return false;

		// A,B are frequency arrays
		int A[] = new int[256];
		int B[] = new int[256];
		for (int i = 0; i < a.length(); i++) {
			A[a.charAt(i)]++;
			B[b.charAt(i)]++;
		}

		// Compare count arrays
		for (int i = 0; i < 256; i++)
			if (A[i] != B[i])
				return false;

		// If code comes here that means frequency of every character is same
		return true;
	}

	public static void main(String[] args) {
		String a = "listen";
		String b = "silent";
		System.out.print("Using Frequency Array : ");
		if (anagram_freq(a, b)) {
			System.out.println("ANAGRAM");
		} else {
			System.out.println("NOT ANAGRAM");
		}

		System.out.print("Using Sorting : ");

		if (anagram_sort(a, b)) {
			System.out.println("ANAGRAM");
		} else {
			System.out.println("NOT ANAGRAM");
		}
	}
}
