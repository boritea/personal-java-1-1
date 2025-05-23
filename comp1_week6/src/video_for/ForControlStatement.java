package video_for;

public class ForControlStatement {
	public static void main(String[] args) {
		// 몇개만 간단히 하겠습니다..
		for (int i = -10; i <= 10; i++) {
			System.out.print(i + " ");
		} // -10 ~ 10
		System.out.println();
		
		for (int i = 1; i < 2000; i *= 2) {
			System.out.print(i + " ");
		} // 2^0, 2^1, 2^2, ... 2000 미만까지 출력
		System.out.println();
		
		int n = 10, fact = 1;
		for (int i = 1; i <= n; i++) {
			 fact *= i;
		} // n 팩토리얼 계산
		System.out.println(fact);
		
		for (int i = 1, j = 9; i <= 9; i++) {
			System.out.print(i * j + " ");
		} // 구구단의 j단을 출력
		System.out.println();
		
		// 무한루프 break
		for (int i = 0; ; i++) {
			if (i > 10) {
				break;
			}
			System.out.print(i + " ");
		} // 0 ~ 10 출력
	}
}
