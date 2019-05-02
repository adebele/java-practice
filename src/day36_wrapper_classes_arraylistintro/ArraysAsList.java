package day36_wrapper_classes_arraylistintro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
	public static void main(String[] args) {

		List<String> cars = new ArrayList<>();
		cars.add("Honda");

		List<Integer> nums = Arrays.asList(4, 2, 5, 7, 8);
		System.out.println(nums.size());
		System.out.println(nums.toString());
		nums.set(0, 7);
		System.out.println(nums.toString());

		// create arraylist prices
		// assign 10 values using Arrays.asList method

		List<Double> prices = Arrays.asList(3.3, 5.2, 7.6, 232.34, 13120.1, 451.9, 1.2, 43.7, 202.2, 0.0);

		System.out.println(prices);
		
		// calculate sum of all prices
		double sum = 0;
		for (double price : prices) {
			sum += price;
		}
		System.out.println("Sum(using for each loop): " +sum);

		double sum2 = 0;
		for(int i=0; i<prices.size();i++) {
			sum2+=prices.get(i);
		}
		System.out.println("Sum(using for loop): "+sum2);
		
		//create new list expensive
		//add prices that are more than 100
		
		List<Double> expensive = new ArrayList<>();
		
		for (double price : prices) {
			if(price>100) {
				expensive.add(price);
			}
		}
		System.out.println(expensive.toString());
		
		
		
		
		
		
	}
}
