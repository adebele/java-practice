package day19_loops;

import java.util.Random;
import java.util.Scanner;

public class GuessANumberV2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();//is used to generate random number
		
		int secretNumber = random.nextInt(101);
		
		System.out.println("### WELCOME TO GUESS A NUMBER GAME ###");
		int guessNumber;
		int count = 0;
		do {
			System.out.println("Guess a number?");
			guessNumber = scan.nextInt();
			if (guessNumber < secretNumber) {
				System.out.println("Your number is too small");
			} else if(guessNumber>secretNumber){
				System.out.println("Your number is too large");
			}
			count++;
		} while ((guessNumber != secretNumber) && count<3);
		
		if (count<3) {
			System.out.println("BINGO, congratulations, You Won!!!");
		}else {
			System.out.println("Sorry you lost, play again.");
		}
	}

}
