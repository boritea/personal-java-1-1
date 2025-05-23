package video_continue;

public class ContinueControlkeyword {
	public static void main(String[] args) {
		//단일 반복문에서 continue
		for (int i = 0; i < 5; i++) {
			if (i == 4) continue;
			System.out.print(i);
		}
		System.out.println();
		
		//중첩 반복문에서 하나만 continue
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j > 2) continue;
				System.out.print(i);
			}
		}
		System.out.println();
		
		//continue LABLE
		POS1: for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 4) continue POS1;
				System.out.print(i);
			}
		}
		System.out.println();
	}
}
