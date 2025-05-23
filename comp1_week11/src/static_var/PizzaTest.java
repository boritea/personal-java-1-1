package static_var;

public class PizzaTest {
	public static void main(String[] args) {
		Pizza p1 = new Pizza("Super Supreme");
		Pizza p2 = new Pizza("Cheese");
		Pizza p3 = new Pizza("Pepperoni");
		int n = Pizza.count;
		System.out.println("지금까지 판매된 피자 갯수 = " + n);
	}
}
