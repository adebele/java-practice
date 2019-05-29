package day41_customclasses02;

public class MyCars {
	public static void main(String[] args) {

		Car car1 = new Car();
		car1.make = "Ford";
		car1.model = "Fiesta";
		car1.color = "Grey";
		car1.currentSpeed =55;
		
		car1.printCarInfo();
		car1.showCurrentSpeed(60);
		car1.showCurrentSpeed(25);
		car1.drive();
		
		

	}
}
