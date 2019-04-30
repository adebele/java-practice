package day31_methods03_042019;

public class Cars {

	public static void main(String[] args) {
		
		drive("Audi", 60);
		drive("Porsche", 85);
	}

	public static void drive(String carName, int speed) {

		System.out.println(carName + " is driving " + speed + " mph.");
	}
}
