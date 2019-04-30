package day24_arrays_040719;

import java.util.*;

public class CarShop {
	public static void main(String[] args) {

		// BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
		// 1. Step: Create an array of strings, and store these cars inside that array.

		String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla" };

		//Car names that start M
		for (String car : cars) {
			if (car.startsWith("M")) {
				System.out.println(car);
			}
		}
		//Car names that has letter r
		System.out.println();
		for (String car : cars) {
			if (car.toLowerCase().contains("r")) {
				System.out.println(car);
			}
		}
		//Car names that ends with a
		System.out.println();
		for (String car : cars) {
			if (car.endsWith("a")) {
				System.out.println(car);
			}
		}

		//Car names that ends with a
		System.out.println();
		for (String car : cars) {
			if (car.charAt(car.length()-1)==('a')) {
				System.out.println(car);
			}
		}
		//Car names that length of 6 characters
		System.out.println();
		for (String car : cars) {
			if (car.length()>5) {
				System.out.println(car);
			}
		}
		//Swap first and last value in array
		System.out.println();
		String swap = cars[0];
		cars[0]=cars[cars.length-1];
		cars[cars.length-1]=swap;
		
		
		/*for (String car : cars) {	
				System.out.println(car);
		}*/
		System.out.println(Arrays.toString(cars));
		
		//Arrays.sort(cars);
		System.out.println(Arrays.toString(cars));
		
		
		
		
	}
}
