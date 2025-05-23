package test01;

import java.util.*;

public class ArrayTest {
	public static void main(String[] args) {
		int[][] arr2 = new int[][] { {7, 9, 1}, {3, 2, 8}, {0, 2, 4} };
		
		System.out.println(arr2);
		
		System.out.println(Arrays.toString(arr2));
		
		for (int i = 0; i < arr2.length; i++) System.out.println(Arrays.toString(arr2[i]));
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}