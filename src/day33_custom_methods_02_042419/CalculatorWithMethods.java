package day33_custom_methods_02_042419;

public class CalculatorWithMethods {
	public static void main(String[] args) {

		double result = add(4, 5);

	}

	public static double multiply(double num1, double num2) {

		return num1 * num2;
	}

	public static double minus(double num1, double num2) {

		return num1 - num2;
	}

	public static double divide(double num1, double num2) {
		if(num2==0) {
			System.out.println("ERROR: cannot / by 0");
			return 0;
		}else {
			double result =num1/num2;
			return result;
		}
		
	}

	public static double add(double num1, double num2) {

		return num1 + num2;
	}
}
