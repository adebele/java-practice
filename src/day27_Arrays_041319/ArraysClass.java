package day27_Arrays_041319;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		int[] nums = { 43, 12, 4, 1, 3, 5 };

		// toString method
		System.out.println(Arrays.toString(nums));
		String str = Arrays.toString(nums);
		System.out.println(str);

		
		  String[] languages = {"Zulu", "Spanish", "Italian", "English", "Polish", "Arabic","Uzbek"};

		  System.out.println(Arrays.toString(languages));
		  
		  Arrays.sort(languages);
		  
		  System.out.println(Arrays.toString(languages));
		  
		  
		  int [] nums2 = {345, 665, 3333, 11, 3, 66};
		  //find lowest and largest values from num2 array
		  
		  Arrays.sort(nums2);
		  int lowest = nums2[0];
		  int largest = nums2[nums.length-1];
		  
		  System.out.println("Largest in the array: "+largest+"\nLowest in the array: "+lowest);
		  
		  
	}
}
