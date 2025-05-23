package video_dowhile;

public class DoWhileControlStatement {
	public static void main(String[] args) {
		//do while은 조건문에 관계없이 최초 한번은 실행됩니다
		int count = 0;
		while (count < 0) {
			System.out.print("@ ");
			count++;
		} // @가 출력되지 않습니다
		System.out.println();
		
		int count2 = 0;
		do {
			System.out.print("@ ");
			count2++;
		} while (false); // @가 한 개 출력됩니다
	}
}
