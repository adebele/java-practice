package day21_loopreview1;

import java.util.*;
public class NumberMoreThan100{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int num=0, num2=0;
		
		while(num + num2 !=100) {
			System.out.println("Enter two numbers");
			num = scan.nextInt();
			num2 = scan.nextInt();
			
		}
	System.out.println("Good Numbers");
	
	/*
	 	int sum = 0;
	 	
	 	do{
	 		System.out.println("Enter 2 numbers");
	 		int num1 = scan.nextInt();
	 		int num2 =scan.nextInt();
	 		sum = num1 + num2;
	 	}while(sum <= 100);
	 	
	 	System.out.println("Good Numbers");
	 
	 */
	}

}
