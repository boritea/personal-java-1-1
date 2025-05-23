package box;

class Box {
	int width;
	int length;
	int height;
	
	double getVolume() {return width * length * height;}
}


public class BoxTest {
	
	public static void main(String[] args) {
		Box b = new Box();
		b.width = 20;
		b.height = 20;
		b.length = 30;
		System.out.println("상자의 가로. 세로, 높이: " + b.width + ", " + b.length + ", " + b.height);
		System.out.println(b.getVolume());
	}

}
