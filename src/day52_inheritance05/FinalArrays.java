package day52_inheritance05;

import java.util.Arrays;

public class FinalArrays {
	public static void main(String[] args) {
		
		final int[] TEAMS = {11, 11};
		System.out.println("Team1 : "+TEAMS[0]);
		System.out.println("Team2 : "+TEAMS[1]);
		
		TEAMS[0] = 10;
		TEAMS[1] = 9;
		
		System.out.println("Team1 : "+TEAMS[0]);
		System.out.println("Team2 : "+TEAMS[1]);
		
		//TEAMS = new int[] {10,10,10}; this won't work since the Array was initialized  as a final
		
		int[] nums = new int[] {23, 55, 35543};
		System.out.println(Arrays.toString(nums));
		
		nums = new int[] {23423, 45645, 2, 24, 23, 4665, 1};
		System.out.println(Arrays.toString(nums));
		
		final int[] finalNums = {23, 66, 44, 11};
		System.out.println(Arrays.toString(finalNums));
		
		finalNums[0] = 34567;
		System.out.println(Arrays.toString(finalNums));
		
		//finalNums = new int[] {22, 44, 56, 1123}; since the array is initialized with a final modifier, this statment won't work.
		
		final double[] PRICES = new double [3];
		PRICES[0] = 85.5;
		PRICES[1] = 99.99;
		PRICES[2] = 99.89;
		
		System.out.println(Arrays.toString(PRICES));
		PRICES[0] = 81.1;
		System.out.println(Arrays.toString(PRICES));
		
		
		
		
		
		
	}
}
