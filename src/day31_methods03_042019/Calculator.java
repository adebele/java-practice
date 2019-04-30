package day31_methods03_042019;

import java.util.Scanner;

public class Calculator {

	// add, subtract, multiply, divide, remainder
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		double n1 = scan.nextInt();
		double n2 = scan.nextInt();
		System.out.println("Select operator: '+', '-', '*', '/' and '%'");
		String operator = scan.next();

		switch (operator) {
		case "+":
			add(n1, n2);
			break;
		case "-":
			subtract(n1, n2);
			break;
		case "/":
			divide(n1, n2);
			break;
		case "*":
			multiply(n1, n2);
			break;
		case "%":
			remainder(n1, n2);
			break;
		default:
			break;

		}

		// multiply(5.4, 3.5);
		// divide(3, 0);
		// subtract(1, 5);
		// remainder(5, 8);

	}

	public static void remainder(double num1, double num2) {
		System.out.println("Result: " + (num1 % num2));

	}

	public static void divide(double num1, double num2) {
		if (num2 != 0) {
			System.out.println("Result: " + (num1 / num2));
		} else {
			System.out.println("You can't divide by 0");
		}
	}

	public static void multiply(double num1, double num2) {
		System.out.println("Result: " + (num1 * num2));

	}

	public static void subtract(double num1, double num2) {
		System.out.println("Result: " + (num1 - num2));

	}

	public static void add(double num1, double num2) {
		System.out.println("Result: " + (num1 + num2));
	}
}
