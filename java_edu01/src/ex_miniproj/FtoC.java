package ex_miniproj;
import java.util.Scanner;

public class FtoC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===================");
		System.out.println("1. 화씨->섭씨");
		System.out.println("2. 섭씨->화씨");
		System.out.println("===================");
		int modSelect = sc.nextInt();
		
		System.out.print((modSelect == 1 ? "화" : "섭") + "씨온도를 입력하시오: ");
		double tempIn = sc.nextDouble();
		double tempOut = ((modSelect == 1) ? 5 * (tempIn - 32) / 9 : tempIn * 9 / 5 + 32);
		System.out.println((modSelect == 1 ? "섭" : "화") + "씨온도는 " + tempOut);
	}
}
