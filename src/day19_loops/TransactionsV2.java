package day19_loops;

import java.util.Scanner;

public class TransactionsV2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("What is your current balance?");
		double balance = scan.nextDouble();
		int count = 0;

		while (balance > 0) {
			count++;
			System.out.println("What is transaction #" + count + " amount?");
			double transaction = scan.nextDouble();
			
			if (transaction > balance) {
				System.out.println("Your balance is about to be negative due to this transaction.");
			} 
				balance -= transaction;
			
			//System.out.println("Remaining balance: " + balance);
		}

		System.out.println("You don't have sufficient funds, your balance is $" + balance);
		System.out.println("Transaction total count: " + count);

	}
}
