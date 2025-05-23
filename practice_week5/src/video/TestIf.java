package video;

public class TestIf {
	public static void main(String[] args) {
		//if
		int value1 = 5;
		if (value1 > 3) {		//참
			System.out.println("실행1");		//출력
		}
		if(value1 < 5) {		//거짓
			System.out.println("실행2");		//출력안됨	
		}
		
		boolean bool1 = true;
		boolean bool2 = false;
		if (bool1) {			//참
			System.out.println("실행3");
		}
		if (bool2) {			//거짓
			System.out.println("실행4");
		}
	}
}
