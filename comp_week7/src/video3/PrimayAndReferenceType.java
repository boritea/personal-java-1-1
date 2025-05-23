package video3;

import java.util.Arrays;

public class PrimayAndReferenceType {
	public static void main(String[] args) {
		//#1. 기본자료형의 대입연산 (stack 값 복사)
		int value1 = 3;
		int value2 = value1; // value2 = 3
		value2 = 7;			 // 7
		System.out.println(value1); //3
		System.out.println(value2); //7
		System.out.println();
		
		//#2. 참조자료형의 대입연산 (stack 값 복사)
		int[] array1 = new int[] {3, 4, 5};
		int[] array2 = array1; //참조주소 복사 => 같은 힙영역 접근 가능
		array2[0] = 7;
		System.out.println(array1[0]); //7
		System.out.println(array2[0]); //7
		
		
		int[] array = new int[] {3, 4, 5, 6, 7};
		
		//#1. 배열의 길이 구하기
		System.out.println(array.length);	//5
		
		//#2. 출력하기 1:
		System.out.print(array[0] + " ");
		System.out.print(array[1] + " ");
		System.out.print(array[2] + " ");
		System.out.print(array[3] + " ");
		System.out.print(array[4] + " ");
		System.out.println();
		
		//#3. 출력하기 2:(반복문 이용)
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
		
		//#4. 출력하기 3:
		//for(꺼낸 하나의 원소를 저장할 수 있는 변수:집합객체) {} for each 구문
		for (int k : array) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		//5. 출력하기 4:
		System.out.println(Arrays.toString(array));
	}
}
