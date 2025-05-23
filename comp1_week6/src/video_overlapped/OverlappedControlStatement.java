package video_overlapped;

public class OverlappedControlStatement {
	public static void main(String[] args) {
		//적당한거 하나만 하겠습니다
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j += 1) {
				int stars = j * 2 + 1;
				if (stars > 5) stars = 10 - stars;
				int blanks = 2 - (stars - 1) / 2;
				for (int k = 0; k < blanks; k++) {
					System.out.print(" ");
				}
				for (int k = 0; k < stars; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
