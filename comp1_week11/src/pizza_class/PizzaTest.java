package pizza_class;

class Pizza {
	int radius;
	
	Pizza (int r) {
		this.radius = r;
	}
	
	static Pizza whosLargest(Pizza p1, Pizza p2) {
		return p1.radius > p2.radius ? p1 : p2;
	}
}

public class PizzaTest {
	public static void main(String[] args) {
		Pizza obj1 = new Pizza(14);
		Pizza obj2 = new Pizza(18);
		
		Pizza largest = Pizza.whosLargest(obj1, obj2);
		System.out.println(largest.radius + "인치 피자가 더 큼.");
	}
}
