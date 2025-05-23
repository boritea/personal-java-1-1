package page_102;
import java.util.Scanner;

public class WelcomeLoop {
	public static void main(String[] args) {
		int sum = 0, value = 0;
		Scanner sc = new Scanner(System.in);
		do {
			sum += value;
			
			System.out.print("정수를 입력하시오: ");
			value = sc.nextInt();
		} while (value != -1);
		System.out.println("정수의 합은 " + sum + "입니다.");
		sc.close();
	}
}
