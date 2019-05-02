package day36_wrapper_classes_arraylistintro;

import java.util.ArrayList;

public class ArrayListIntro {
	public static void main(String[] args) {

		// create an arraylist

		String[] str = new String[5];

		ArrayList<String> names = new ArrayList<>();

		int[] numsArray = new int[5];

		// ArrayList<int> nums
		ArrayList<Integer> nums = new ArrayList<>();

		// assign values into arraylist
		names.add("Roman");
		names.add("Orhan");
		names.add("Vlad");
		names.add("Natalia");
		names.add("Raul");
		names.add("Tioma");

		nums.add(100);
		nums.add(50);

		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		System.out.println();
		System.out.println("Names count: "+names.size());
		System.out.println("Nums count: "+ nums.size());
		
		
		
	}
}
