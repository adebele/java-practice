package day30_methods02_041719;

import java.util.Random;
import java.util.Scanner;

public class MethodsPrintStars {
	public static void main(String[] args) {

		int num = 0;
		while (num <= 100) {
			// printStars();
			num++;
		}
		//introduce();
		//showMeNumbers();
		//doPush10Ups();
		rangePrint();
	}

	public static void printStars() {
		System.out.println("*****");

	}

	public static void introduce() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.nextLine();
		System.out.println("Nice to meet you " + name);
	}

	public static void showMeNumbers() {
		Random random = new Random();

		for (int i = 1; i <= 5; i++) {
			System.out.print(random.nextInt(1001) + ", ");
		}
		System.out.println();
	}

	public static void doPush10Ups() {
		for (int j = 1; j <= 10; j++) {
			System.out.println("Pushup - " + j);
		}
		System.out.println("Time to rest");
	}

	public static void rangePrint() {
		System.out.println("Please enter two numbers:");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if (num1 < num2) {
			for (int n = num1; n <= num2; n++) {
				System.out.print(n + ", ");
			}
		} else  {
			for (int n = num1; n >= num2; n--) {
				System.out.print(n + ", ");
			}
		}
	}

}
