package class3_boj;

import java.util.Scanner;

public class RunningTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < 3) System.out.println("0");
		else {
			System.out.println((n - 2) * (n - 1) * n);
		}
		System.out.println("3");
	}
}
