package class3_boj;
import java.util.*;

public class Blackjack {
	public static void main(String[] args) {
		int n = 0, m = 0, max = 0, temp = 0;
		int[] arr = new int[101];
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if ((i == j) || (j == k) || (k == i)) continue;
					temp = arr[i] + arr[j] + arr[k];
					if ((temp > max) && (m >= temp)) {
						max = temp;
					}
				}
			}
		}
		System.out.println(max);
	}
}
