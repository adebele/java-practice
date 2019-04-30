package day19_loops;

import java.util.*;

public class Transactions {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your current balance?");
		double balance = scan.nextDouble();
		
	while (balance>0) {
		System.out.println("What is transaction amount?");
		double spent = scan.nextDouble();
		balance -= spent;
	}
	
	System.out.println("You don't have sufficient funds, your balance is $"+balance);
	}
}
