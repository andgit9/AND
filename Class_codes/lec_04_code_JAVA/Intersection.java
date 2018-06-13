/**
 * @author avcbcoder
 * last modified @11-Jun-2018 @11:40:26 PM
 * GeeksClasses - Class_codes.lec_04_code_JAVA
 * TODO
 */
package Class_codes.lec_04_code_JAVA;

import java.util.ArrayList;
import java.util.HashSet;

public class Intersection {
	public static void main(String... arg) {

		int arr1[] = { 1, 2, 2, 2, 3, 1, 6 };
		int arr2[] = { 1, 2, 2, 2 };

		HashSet<Integer> arr1_ele = new HashSet<>();
		HashSet<Integer> arr2_ele = new HashSet<>();

		ArrayList<Integer> intersection = new ArrayList<>();

		// inserting the elements of array1 into set1
		for (int i = 0; i < arr1.length; i++)
			arr1_ele.add(arr1[i]);

		for (int i = 0; i < arr2.length; i++) {
			if (arr2_ele.contains(arr2[i]) == false)
				arr2_ele.add(arr2[i]);
			if (arr1_ele.contains(arr2[i]) == true)
				intersection.add(arr2[i]);
		}
		// We can directly print arraylists since ArrayList class has
		// overrided the toString method
		System.out.println(intersection);
	}

}
