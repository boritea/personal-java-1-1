package ex_5_2;
import java.util.*;

public class SwitchCoffee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("커피 이름을 입력해 주세요: ");
		String coffee = sc.next();
		System.out.print("아이스라면 1, 아니라면 0을 입력해 주세요.: ");
		int ice = sc.nextInt();
		int price = 0;
		switch (coffee) {
			case "아메리카노":	  price = (ice == 0 ? 1500 : 2000); break;
			case "콜드브루":	  price = 3500;					    break;
			case "카페라떼":	  price = 2900;						break;
			default:		  price = 0;						break;
		}
		System.out.println((ice == 0 ? "" : "아이스 ") + coffee + "의 가격=" + price);
	}
}
