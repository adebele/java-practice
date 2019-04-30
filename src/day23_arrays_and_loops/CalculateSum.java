package day23_arrays_and_loops;

import java.util.*;

public class CalculateSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// let's write a program
		// that will calculate a sum of 6 numbers
		// if numbers is less or equals to 0, ignore this
		// we need to ask user to provide a number

		int sum = 0;
		int num = 0;
		for (int i = 0; i < 6; i++) {
			System.out.println("Enter a number:");
			num = scan.nextInt();
			if (num <= 0) {
				continue;
			}
			sum += num;

		}

		System.out.println("Sum:"+sum);
	}

}
