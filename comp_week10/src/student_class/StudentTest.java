package student_class;

import java.util.Scanner;

class Student {

	String name;
	int age;
	private int rollno;
	
	public static Student create() {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.print("학생의 이름: ");
		s.name = sc.nextLine();
		System.out.print("학생의 학번: ");
		s.rollno = sc.nextInt();
		System.out.print("학생의 나이: ");
		s.age = sc.nextInt();
		System.out.println("Student 객체가 생성되었습니다.");
		sc.close();
		return s;
	}
	
	public String toString() {
		return "[이름: " + name + ", 학번:" + rollno + ", 나이: " + age + "]";
	}

}

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student dongjun = Student.create();
		System.out.println(dongjun);
		
	}

}
