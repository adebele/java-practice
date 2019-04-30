package day19_loops;

import java.util.*;

public class GuessANumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();//is used to generate random number
		
		int secretNumber = random.nextInt(101);
		
		System.out.println("### WELCOME TO GUESS A NUMBER GAME ###");
		int guessNumber;

		do {
			System.out.println("Guess a number?");
			guessNumber = scan.nextInt();
			if (guessNumber < secretNumber) {
				System.out.println("Your number is too small");
			} else if(guessNumber>secretNumber){
				System.out.println("Your number is too large");
			}
		} while (guessNumber != secretNumber);
		
		System.out.println("BINGO, congratulations, You Won!!!");
	}

}
