/**
 * @author avcbcoder
 * last modified @11-Jun-2018 @11:57:50 PM
 * GeeksClasses - Class_codes.lec_04_code_JAVA
 * TODO
 */
package Class_codes.lec_04_code_JAVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class RemoveDuplicateWords {
	public static InputStreamReader r = new InputStreamReader(System.in);
	public static BufferedReader br = new BufferedReader(r);

	public static void main(String[] args) throws Exception {
		String s;
		String modified_s = "";

		// read a string with spaces
		s = br.readLine();
		// Using this method will split the string by spaces
		// and return an array of strings
		String[] words = s.split(" ");
		// It will contain all the unique words
		HashSet<String> unique_words = new HashSet<>();
		for (String w : words) {
			// Add this word only if it is not visited before
			if (!unique_words.contains(w))
				modified_s = modified_s + w + " ";
			unique_words.add(w);
		}
		System.out.println(modified_s);
	}
}
