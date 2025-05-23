package ex_3_2;
import java.util.Scanner;

public class GradingPlus {
	public static void main(String[] args) {
		int score; // 0에서 100까지의 값만 입력된다고 가정합니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하시오: ");
		score = sc.nextInt();
		score /= 5;
		String grade = "";
		
		switch (score) 
		{
			case 20:
			case 19:	grade = "A+";	break;
			case 18: 	grade = "A0";	break;
			case 17:	grade = "B+";	break;
			case 16: 	grade = "B0";	break;
			case 15:	grade = "C+";	break;
			case 14: 	grade = "C0";	break;
			case 13:	grade = "D+";	break;
			case 12: 	grade = "D0";	break;
			default: 	grade = "F";	break;
		}
		System.out.println("학점 " + grade);
	}
}
