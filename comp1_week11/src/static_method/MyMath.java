package static_method;

public class MyMath {
	public static int abs(int x) { return x > 0 ? x : -x; }
	public static int power(int base, int exp) {
		int result = 1;
		for (int i = 0; i < exp; i++)
			result *= base;
		return result;
	}
}
