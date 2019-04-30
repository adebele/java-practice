package day24_arrays_040719;

import java.util.Arrays;

public class LotteryTicket {
	public static void main(String[] args) {
		int[] lotteryNumbers = {12, 45, 3, 62, 42, 90};
		System.out.println(Arrays.toString(lotteryNumbers));
		Arrays.sort(lotteryNumbers);
		System.out.println(Arrays.toString(lotteryNumbers));
		//binary search works only with sorted array
		
		int index = Arrays.binarySearch(lotteryNumbers, 45  );
		System.out.println(index);
	
	
	
	}

}
