package rocket_class;

class Rocket {
	
	int x, y;
	
	Rocket(int x, int y) {
		this.x = x; this.y = y;
	}
	
	void moveUp() {
		y += 1;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}

public class RocketTest {
	public static void main(String[] args) {
		
		Rocket r = new Rocket(5, 5);
		for (int i = 0; r.y < 100; i++) {
			r.moveUp();
		}
		System.out.println(r);
		
	}
}
