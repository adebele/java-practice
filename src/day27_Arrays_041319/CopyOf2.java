package day27_Arrays_041319;

import java.util.Arrays;

public class CopyOf2 {
	public static void main(String[] args) {
		
		int[] nums1 = {34, 56, 23, 1, 55};
		
		int[] nums2 = Arrays.copyOf(nums1, nums1.length+2);
		
		int[] nums3 = Arrays.copyOfRange(nums1, 1, 3);
		System.out.println("Nums3: "+ Arrays.toString(nums3));
	
		System.out.println(Arrays.toString(nums2));
		nums2[5] = 100;
		nums2[6] = 200;
		System.out.println(Arrays.toString(nums2));
		
		int [] brandNew = {34,23, 54, 23};
		System.out.println("Length before:"+ brandNew.length);
		brandNew = Arrays.copyOf(brandNew, brandNew.length + 5);
		System.out.println("Length after:"+ brandNew.length);
		
		
	}
}
