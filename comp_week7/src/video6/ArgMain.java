package video6;

public class ArgMain {
	public static void main(String[] args) {	// (실행 시 입력 데이터: abc 13 123 a)
		//#1. args 배열의 길이 구하기
		System.out.println(args.length); //4
		System.out.println();
		
		//#2. 매개변수 출력 1
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]); //abc 13 123 a (줄바꾸어서 출력)
		}
		System.out.println(Integer.parseInt(args[1]) + 1); // 14 (13 + 1)
		System.out.println();
		
		//#3. 매개변수 출력 2
		for (String s : args) {
			System.out.println(s); //abc 13 123 a (줄바꾸어서 출력)
		}
		System.out.println();
	}
}
