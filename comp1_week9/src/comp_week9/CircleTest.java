package comp_week9;
import java.util.*;

public class CircleTest {
	public static void main(String[] args) {
		Circle obj1 = new Circle(), obj2 = new Circle();
		obj1.radius = 100; obj1.color = "red";
		obj2.radius = 200; obj2.color = "Blue";
		System.out.println("obj1 반지름: " + obj1.radius);
		System.out.println("obj1 면적: " + obj1.getArea());
		System.out.println("obj2 반지름: " + obj2.radius);
		System.out.println("obj2 면적: " + obj2.getArea());
	}
}
