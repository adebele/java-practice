package day39_arraylist04_050519;

import java.util.*;

public class CustomListMethods {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(10); nums.add(10); nums.add(7); nums.add(8);
		nums.add(8); nums.add(3); nums.add(4); nums.add(8);
		printList(nums);
		
		ArrayList<Double> nums2 = new ArrayList<>();
		nums2.add(4.6); nums2.add(8.0); nums2.add(9.3);nums2.add(2.9);nums2.add(7.2);
		
		sumList(nums2);
		
		printList(getRandomList(5));
		
		List<String> strL = new ArrayList<>();
		strL.add("54"); strL.add("5"); strL.add("86"); strL.add("234");	strL.add("14");
		
		System.out.println(convertIntList(strL));
		
		
		
	}

	public static void printList(List<Integer> nums) {

		for (Integer n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
		
	public static double sumList(ArrayList<Double> nums) {
		double sum=0.0;
		for(Double n: nums) {
			sum+=n;
		}
	return sum;
	}
	
	public static ArrayList<Integer> getList(int size){
	
		ArrayList<Integer> num = new ArrayList<>();
		for(int w = 1; w <= size; w++) {
			num.add(w);
		}
		return num;
	}
	public static List<Integer> getRandomList(int size){
		Random ran = new Random();
		List<Integer> randomNums = new ArrayList<>();
		for(int i=0; i<size;i++) {
			randomNums.add(ran.nextInt(101));
		}
		
		return randomNums;
	}
		
	public static List<Integer> convertIntList(List<String> str){
		List<Integer> nums = new ArrayList<>();
		
		for(String s : str) {
			nums.add(Integer.parseInt(s));
		}
		
	return nums;
	}
		
		
	




}
