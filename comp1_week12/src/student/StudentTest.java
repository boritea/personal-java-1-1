package student;

class Person {
	private String regnumber;
	private double weight;
	protected int age;
	String name;
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}

class Student extends Person {
	int id;
}

public class StudentTest {
	public static void main(String[] args) {
		Student obj = new Student();
		//obj.number = "123456-123456";		//오류
		//obj.weight = 75.0;				//오류
		obj.age = 21;
		obj.name = "Kim";
		obj.setWeight(75.0);
		System.out.println(obj.age + " " + obj.name + " " + obj.getWeight());
	}
}
