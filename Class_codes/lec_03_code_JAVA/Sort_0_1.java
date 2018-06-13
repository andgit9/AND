/**
 * @author avcbcoder
 * last modified @11-Jun-2018 @6:41:57 PM
 * GeeksClasses - Class_codes.lec_03_code_JAVA
 * TODO
 */
package Class_codes.lec_03_code_JAVA;

import java.util.Arrays;

public class Sort_0_1 {
	// Sort the input array, the array is assumed to
	// have values in {0, 1, 2}
	public static void sort012(int a[]) {
		int arr_size = a.length;
		int lo = 0;
		int hi = arr_size - 1;
		int mid = 0;

		while (mid <= hi) {
			if (a[mid] == 0) {
				int t = a[lo];
				a[lo] = a[mid];
				a[mid] = t;
				lo++;
				mid++;
			} else if (a[mid] == 1) {
				mid++;
			} else {
				int t = a[hi];
				a[hi] = a[mid];
				a[mid] = t;
				hi--;
			}

		}
	}

	/* driver program to test */
	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		sort012(arr);
		System.out.println("array after segregation ");
		System.out.println(Arrays.toString(arr));

	}
}
