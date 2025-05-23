package video_while;
import java.util.Scanner;

public class WhileControlStatement {
	public static void main(String[] args) {
		int n = 1;
		while (n < 2000) {
			n *= 2;
		} // 2000 와 같거나 큰 2 거듭제곱 중에 가장 작은 값 구하기
		System.out.println(n);
		
		//for 로 표현
		int num = 1;
		for ( ; num < 2000; ) {
			 num *= 2;
		}
		System.out.println(num);
		
		//음수 입력시 무한루프 break
		Scanner sc = new Scanner(System.in);
		while (true) {
			int k = sc.nextInt();
			if (k < 0) break;
		}
	}
}
