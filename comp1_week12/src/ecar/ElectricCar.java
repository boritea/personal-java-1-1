package ecar;

class Car {
	int speed;
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}

class ElectricCar extends Car {
	int battery;
	
	public void charge(int amount) {
		battery += amount;
	}
	
	ElectricCar() {
		this.speed = 0;
		this.battery = 0;
	}
	
	public String toString() {
		return "[속도: " + speed + ", 배터리 잔량: " + battery + "]";
	}
}
