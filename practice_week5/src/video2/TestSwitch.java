package video2;

public class TestSwitch {
	public static void main(String[] args) {

		//break가 포함되지 않았을 때
		int value1 = 2;
		switch(value1) {
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B");
		case 3:
			System.out.println("C");
		default:
			System.out.println("D");
		}
		System.out.println();
	}
}
