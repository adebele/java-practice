package day12_switch_ternary;

import java.util.*;

public class CalculatorV01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Get numbers
		System.out.println("Enter first number:");
		double num1 = input.nextDouble();
		System.out.println("Enter second number:");
		double num2 = input.nextDouble();

		// Get operator
		System.out.println("Select Operator: +, -, *, /, %");
		String operator = input.next();

		// perform calculation and display result

		double result = 0.0;

		if (operator.equals("+")) {
			result = num1 + num2;
			// System.out.println("Result: "+result);
		} else if (operator.equals("-")) {
			result = num1 + num2;
		} else if (operator.equals("*")) {
			result = num1 * num2;
		} else if (operator.equals("/")) {
			result = num1 / num2;
		} else if (operator.equals("%")) {
			result = num1 % num2;
		} else {
			System.out.println("Invalid operator: " + operator);
			return; // Do not execute the remaining code. STOP HERE
			// System.exit(0)
		}

		System.out.println("Result: " + result);
	}
}
