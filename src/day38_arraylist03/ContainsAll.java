package day38_arraylist03;

import java.util.*;
public class ContainsAll {
	public static void main(String[] args) {
		List<Integer> num1 = new ArrayList<>();
		num1.add(10);
		num1.add(20);
		num1.add(30);
		num1.add(40);
		
		List<Integer>num2 = new ArrayList<>();
		num2.add(20); num2.add(40);num2.add(10);
		
		//test if num1 has all num2 values
		
		System.out.println("Does Num1 containAll of Num2: "+num1.containsAll(num2));
		
		List<String> planA = new ArrayList<>();
		planA.add("Java");planA.add("replit");planA.add("ping pong");planA.add("food");planA.add("run");planA.add("sleep");
		
		List<String> planB = new ArrayList<>();
		planB.add("food"); planB.add("run"); planB.add("sleep");planB.add("Java");planB.add("ping pong");planB.add("replit");
		
		
		System.out.println("Do the two lists contain same elements(but not in the same order: "+(planB.containsAll(planA) && planA.containsAll(planB)));
			
		
		
		
		
	}
}
