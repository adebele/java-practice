package day08_casting_conditionals;

import java.util.*;
public class IfElsewithScanner {

	public static void main(String[] args) {

		//passingPercentage = 65;
		//yourScorePercentage = take from scanner
		//check if you passed or failed
		
		
		int passingPercentage =65;
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your score? ");
		
		int yourScorePercentage = scan.nextInt();
		
		if (yourScorePercentage >=passingPercentage) {
				System.out.println("Good Job, You passed");
		} else
			System.out.println("You are a failure, smh");
		
		
	}

}
