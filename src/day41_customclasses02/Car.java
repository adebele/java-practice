package day41_customclasses02;

public class Car {
	String make;
	String model;
	int currentSpeed;
	String color;

	public void printCarInfo() {
		String info = "Car make[" + make + "], model[" + model + "], color[" + color + "], currentSpeed[" + currentSpeed
				+ "]";
		System.out.println(info);
	}

	public void showCurrentSpeed(int speedLimit) {
		if (currentSpeed <= speedLimit) {
			System.out.println(
					make + " is driving at " + currentSpeed + " mph, following the speed limit - " + speedLimit);
		} else {
			System.out.println(make + " is driving at " + currentSpeed + " mph, over the speed limit - " + speedLimit);
		}
	}
	
	public void drive() {
		System.out.println(make + " "+model +" is driving.");
	}
	
	public void accelerat (int mph) {
		currentSpeed += mph;
		
	}
	
	
	
	
}
