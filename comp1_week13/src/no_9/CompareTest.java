package no_9;

class Rectangle implements Comparable<Rectangle> {
	int width, height;
	public String toString() {
		return "Rectangle [width = "+width+", height = "+height+"]";
	}
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println(toString());
	}
	public int compareTo(Rectangle r) {
		int a = this.width * this.height;
		int b = r.width * r.height;
		return (a > b ? 1 : (a == b ? 0 : -1));
	}
}

public class CompareTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(100, 30);
		Rectangle r2 = new Rectangle(200, 10);
		Rectangle larger;
		switch (r1.compareTo(r2)) {
			case 1:		larger = r1; 	break;
			case -1:	larger = r2; 	break;
			default:	larger = null;
		}
		if (larger != null) {
			System.out.println(larger + "가 더 큽니다.");
		} else System.out.println("같습니다.");
	}
}
