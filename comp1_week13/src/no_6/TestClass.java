package no_6;

interface Drawable {
	void draw();
	public default void getSize() {
		System.out.println("1024*768 해상도");
	}
}

class Circle implements Drawable {
	int radius;
	public void draw() { System.out.println("Circle draw"); }
	@Override
	public void getSize() { System.out.println("3000*2000 해상도"); }
}

public class TestClass {
	public static void main(String[] args) {
		Drawable d = new Circle();
		d.getSize();
		d.draw();
	}
}
