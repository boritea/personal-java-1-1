package video1;

public class ArrayDefine {
	public static void main(String[] args) {
		//배열의 값 대입 방법 1
		int[] array1 = new int[3];
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;
		System.out.println(array1[0] + ' ' + array1[1] + " " + array1[2]);
		
		int[] array2;
		array2 = new int[3];
		array2[0] = 30;
		array2[1] = 40;
		array2[2] = 50;
		System.out.println(array2[0] + ' ' + array2[1] + " " + array2[2]);		
		
		//배열의 값 대입 방법 2
		int array3[] = new int[] {300, 400, 500};
		System.out.println(array3[0] + ' ' + array3[1] + " " + array3[2]);
		
		int array4[];
		array4 = new int[] {3000, 4000, 5000, 6000};
		System.out.println(array4[0] + ' ' + array4[1] + " " + array4[2] + " " + array4[3]);
		
		//배열의 값 대입 방법 3
		int[] array5 = {10, 20, 30};
		System.out.println(array5[0] + " " + array5[1] + " " + array5[2]);
		
		//int[] array6;
		//array6 = {10, 20, 30}; //불가능
		
		
		//다양한 배열 선언(기본 자료형 배열, 참조 자료형 배열)
		//boolean[] array5 = new boolean[5];
		//double[] array7 = new double[8];
		//String[] array8 = new String[7];
	}
}
