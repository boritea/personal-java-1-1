package video2;

import java.util.Arrays;

public class InitialValue {
	public static void main(String[] args) {
		//#1. stack 메모리값 (강제초기화 되지 않음)
		int value1;
//		System.out.println(value1); // 오류 (값이 없음)
		int[] value2;
//		System.out.println(value2); // 오류 (값 없음)
		
		int value3 = 0;
		System.out.println(value3); // 0
		int[] value4 = null;
		System.out.println(value4); // null
		System.out.println();
		
		//#2. heap 메모리의 초기값 (강제초기화)
		//@기본자료형 배열
		boolean[] array1 = new boolean[3]; //false
		for (int i = 0; i < 3; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		
		int[] array2 = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		
		double[] array3 = new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.print(array3[i] + " ");
		}
		System.out.println();
		
		//@참조자료형 배열
		String[] array4 = new String[3]; //null으로 초기화
		for (int i = 0; i < 3; i++) {
			System.out.print(array4[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		//배열을 쉽게 출력할 수 있는 방법
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
	}
}
