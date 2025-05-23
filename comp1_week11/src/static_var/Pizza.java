package static_var;

public class Pizza {
	private String toppings;
	private int radius;		//이거 활용하는 부분이 없네요?
	static final double PI = 3.141592;
	static int count = 0;
	
	public Pizza(String toppings) {
		this.toppings = toppings;
		count++;
	}
}
