package ecar;

public class ElectricCarTest {
	public static void main(String[] args) {
		ElectricCar obj = new ElectricCar();
		obj.speed = 10;
		obj.setSpeed(60);
		obj.charge(10);
		System.out.println(obj);
	}
}
