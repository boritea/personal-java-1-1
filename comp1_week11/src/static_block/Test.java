package static_block;

public class Test {
	static int number;
	static String s;
	static {
		number = 23;
		s = "Hello World!";
	}
	
	public static void main(String[] args) {
		System.out.println("number: " + number);
		System.out.println("s: " + s);
	}
}
