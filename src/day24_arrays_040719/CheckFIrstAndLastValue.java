package day24_arrays_040719;

public class CheckFIrstAndLastValue {
	public static void main(String[] args) {
		/*
		 * Write a program that will print true
		 * if first and last number is the same
		 * if first and last value in the array of ints
		 * is same, print true
		 */
		int[] numbers = {12, 41, 213, 21, 42, 12};
		
		boolean result = numbers[0] == numbers[numbers.length-1] ? true: false; 
		
		
		
	}
}
