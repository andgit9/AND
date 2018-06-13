/**
 * @author avcbcoder
 * last modified @11-Jun-2018 @11:49:30 PM
 * GeeksClasses - Class_codes.lec_04_code_JAVA
 * TODO
 */
package Class_codes.lec_04_code_JAVA;

public class LongestPalindrome {
	// This function will return length of longest possible palindrome
	public static int longestPalindrome(String s) {
		int arr[] = new int[256];
		int n = s.length();
		if (n == 0)
			return 0;
		for (int i = 0; i < n; i++)
			arr[s.charAt(i)]++;

		int count = 0;
		for (int i = 0; i < 256; i++) {

			if (arr[i] % 2 == 1) {
				count++;
			}
		}

		if (count == 0)
			return n;
		return (n - count + 1);
	}

	public static void main(String... HELLO) {
		String a = "aaaaaaav";
		System.out.println(longestPalindrome(a));
	}
}
