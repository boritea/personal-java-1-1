package shape;

class Shape {
	protected int x, y;
	public void draw() {System.out.println("Shape Draw");}
}

class Circle extends Shape {
	private int radius;
	public void draw() {System.out.println("Circle Draw");}
}

class Rectangle extends Shape {
	private int width, height;
	public void draw() {System.out.println("Rectangle Draw");}
}

class Triangle extends Shape {
	private int base, height;
	public void draw() {System.out.println("Triangle Draw");}
}

public class ShapeTest {
	public static void print(Shape s) {
		System.out.println("x = " + s.x + ", y = " + s.y);
	}
	public static void main(String[] args) {
		Rectangle s1 = new Rectangle();
		Triangle s2 = new Triangle();
		Circle s3 = new Circle();
		
		print(s1);
		print(s2);
		print(s3);
	}
}
