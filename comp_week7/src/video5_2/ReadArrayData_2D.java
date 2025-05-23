package video5_2;

public class ReadArrayData_2D {
	public static void main(String[] args) {
		//#1. 2차원 데이터의 배열의 길이
		int[][] array1 = new int[2][3]; //2행 3열 - 정방행렬(열의 수가 모두 같음 - 3)
		System.out.println(array1.length); //2 - 행의 개수
		System.out.println(array1[0].length); //3 첫번째 행이 가리키는 1차원 배열의 개수
		System.out.println(array1[1].length); //3 두번째 행이 가리키는 1차원 배열의 개수
		System.out.println();
		
		//
		System.out.println("-------------");

		int[][] array2 = new int[][] {{1, 2}, {3, 4, 5}};
		System.out.println(array2.length); //2 - 행의 개수
		System.out.println(array2[0].length); //2 첫번째 행이 가리키는 1차원 배열의 개수
		System.out.println(array2[1].length); //3 두번째 행이 가리키는 1차원 배열의 개수
		System.out.println();
		
		System.out.println("-------------");
		
		//#2. 2차원 배열의 출력 방법
		System.out.print(array2[0][0] + " ");
		System.out.print(array2[0][1] + " ");
		System.out.println();
		System.out.print(array2[1][0] + " ");
		System.out.print(array2[1][1] + " ");
		System.out.println(array2[1][2]);
		System.out.println();
		
		System.out.println("-------------");
		//반복문 이용
		for (int i = 0; i < array2.length; i++) { //행 번호 제어 i
			for (int j = 0; j < array2[i].length; j++) { //각 행의 열 번호 제어 j
				System.out.println(array2[i][j]); //i = 0 -> j = 0, 1 (1, 2) 출력하고
												  //i = 1 -> j = 0, 1, 2 (3, 4, 5) 출력
			}
			System.out.println(); //줄바꿈
		}
		System.out.println();
		
		System.out.println("#############");
		//for(하나의 원소를 꺼냈을때 저장할 변수:집합객체)
		for (int[] array : array2) { //array2 배열에서 0번, 1번 행데이터를 array(1차원배열)로 가져옴
			for(int k : array) {  //array 1차원 배열의 각 요소를 k로 가져옴
				System.out.println(k + " ");
			}
			System.out.println();
		}
	}
}
