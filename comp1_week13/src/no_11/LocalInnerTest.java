package no_11;

class localInner {
	private int data = 30;
	
	void display() {
		final String msg = "현재의 데이터값은 ";
		
		class Local {
			void printMsg() {
				System.out.println(msg + data);
			}
		}
		Local obj = new Local();
		obj.printMsg();
	}
}

public class LocalInnerTest {
	public static void main(String[] args) {
		localInner obj = new localInner();
		obj.display();
	}
}
