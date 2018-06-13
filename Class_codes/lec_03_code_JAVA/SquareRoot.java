/**
 * @author avcbcoder
 * last modified @11-Jun-2018 @6:47:26 PM
 * GeeksClasses - Class_codes.lec_03_code_JAVA
 * TODO
 */
package Class_codes.lec_03_code_JAVA;

public class SquareRoot {
	// Finding square root in rootN
	public static int square_root(int n) {
		if (n == 0 || n == 1)
			return n;
		for (int i = 1; i <= n; i++) {
			if (i * i == n || (i * i < n && (i + 1) * (i + 1) > n))
				return i;
		}
		return 0;
	}

	// Finding Square root in logN
	public static int square_root_new(int l, int r, int n) {
		if (n == 0 || n == 1)
			return n;
		int mid = (l + r) / 2;
		if (mid * mid == n || (mid * mid < n && (mid + 1) * (mid + 1) > n))
			return mid;
		if (mid * mid < n) {
			return square_root_new(mid + 1, r, n);
		} else {
			return square_root_new(l, mid - 1, n);
		}
	}

	public static void main(String[] args) {
		System.out.println(square_root(28));
		System.out.println(square_root_new(1, 28, 28));
	}
}
