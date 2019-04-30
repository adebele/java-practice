package day12_switch_ternary;

import java.util.Scanner;

public class CalculatorV02 {
	public static void main (String[] args) {
		
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

		switch (operator) {
		case ("+"):
			result = num1 + num2;
			break;
		case ("-"):
			result = num1 + num2;
			break;
		case ("*"):
			result = num1 * num2;
			break;
		case ("/"):
			result = num1 / num2;
			break;
		case ("%"):
			result = num1 % num2;
			break;
		default:
			System.out.println("Invalid operator: " + operator);
			break;
		
		}
		System.out.println("Result: " + result);
	}
}
