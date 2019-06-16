package day37_arraylist_050119;

import java.util.ArrayList;

public class RemoveInteger {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>(10);
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		System.out.println(nums.size()==0);
		
		
		nums.add(4);
		nums.add(43);
		nums.add(54);
		nums.add(1);
		nums.add(5);
		nums.add(9);
		nums.add(55);
		nums.add(100);
		
		
		System.out.println(nums.toString());
		nums.remove(5);//doesn't remove 5 but the object at index 5
		
		System.out.println(nums.toString());
		
		
		Integer n1 = new Integer (5);
		Integer n2 = Integer.valueOf(5);
		nums.remove(n1);
		
		
		nums.remove(new Integer(5));
		System.out.println(nums.toString());
		
		
	}
}
