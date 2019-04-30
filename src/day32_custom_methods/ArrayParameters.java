package day32_custom_methods;

import java.util.Arrays;

public class ArrayParameters {
	public static void main(String[] args) {
		int[] myArray = { 44, 22, 66, 11 };
		int[] myArray2 = { 34, 23, 78, 12 };
		printArray(myArray);
		printArray(new int[] { 33, 45, 5, 7 });
		//printArray(new int[] { 3, 4, 2, 5, 23, 5, 46 });

		print2Array(myArray, myArray2);

	}

	public static void printArray(int[] nums) {
		for (int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	public static void print2Array(int[] nums, int[] nums2) {
		if (nums.length > nums2.length) {
			printArray(nums);
			printArray(nums2);

		} else {
			printArray(nums2);
			printArray(nums);
		}
	}

}
