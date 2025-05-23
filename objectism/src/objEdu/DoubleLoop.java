package objEdu;
import java.util.*;

public class DoubleLoop {
	String feature1 = "굉장히 멋짐";
	
	int[][] makingMatrix(int r, int c, Scanner sc) {
		int[][] Matrix = new int[r][c];
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				Matrix[i][j] = sc.nextInt();
			}
		}
		return Matrix;
	}
	
	void sumMatrix(int[][] m1, int[][] m2) {
		for(int i = 0; i < m1.length; i++) {
			for(int j = 0; j < m1[i].length; j++) {
				System.out.print(m1[i][j] + m2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
