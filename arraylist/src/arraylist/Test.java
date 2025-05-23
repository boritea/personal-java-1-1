package arraylist;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		for (int k : list) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println(list.indexOf(1));
		list.remove(list.indexOf(1));
		System.out.println(list.get(0));
		System.out.println(list.indexOf(1));
	}
}
