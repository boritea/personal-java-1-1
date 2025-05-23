package video_break;

public class BreakControlKeyword {
	public static void main(String[] args) {
		//단일 반복문 break
		for (int i = 0; i < 10; i++) {
			if (i == 5) break;
			System.out.print(i + " ");
		} // 0 ~ 4
		System.out.println();
		
		//다중 반복문 중에 하나만 break
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				if (j >= 5) break;
				System.out.print("@");
			}
			System.out.println();
		}
		
		//break LABLE로 한번에 탈출
		POS1: for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 4) break POS1;
				System.out.print(i);
			}
		}
		System.out.println();
		
		//변수값을 조정해서 적당히 탈출
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i);
				if (i == 3 && j == 4) i = 100;
			}
		}
		System.out.println();
	}
}
