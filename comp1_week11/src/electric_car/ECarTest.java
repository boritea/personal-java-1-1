package electric_car;

class ECar {
	int dist;
	int battery;
	
	static ECar getInstance() {
		ECar ec = new ECar();
		ec.battery = 100; ec.dist = 0;
		return ec;
	}
	
	void dispDistance() { System.out.println("주행거리 " + dist + "km"); }
	void dispBattery() { System.out.println("배터리 " + battery + "%"); }
	void drive() {
		if (battery >= 0) {
			battery -= 10; dist += 1;
		}
		else System.out.println("배터리 empty");
	}
}

public class ECarTest {
	public static void main(String[] args) {
		ECar car = ECar.getInstance();
		car.drive();
		car.drive();
		
		car.dispBattery();
		car.dispDistance();
	}
}
