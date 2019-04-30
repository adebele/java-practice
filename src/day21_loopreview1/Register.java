package day21_loopreview1;

import java.util.*;
public class Register {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("How many items are you purchasing?");
		int itemNum = scan.nextInt();
		String item =""; 
		String item2="";
		double price =0.0;
		double totalPrice =0.0;
		for (int i=1; i<=itemNum; i++) {
			System.out.println("what is item "+i);
			item = scan.next();
			item2 += item+", ";
			System.out.println("How much is "+item);
			price = scan.nextDouble();
			totalPrice =totalPrice+price;
		}
		
		if (itemNum>0) {
		item2 = item2.substring(0, item2.length()-2);
		}
		
		System.out.println("your items:"+item2);
		System.out.println("Your total price:"+totalPrice);
	}

}
