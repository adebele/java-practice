package day08_casting_conditionals;

import java.util.*;

public class VotingEligibility {

	public static void main(String[] args) {

		/*
		 * program to tell if you are eligible to vote. votingAge=18 yourAge = take from
		 * scanner if you are eligible to vote: you are eligible to vote. you have been
		 * eligible for 3 years else you are not eligible to vote you still have 3 years
		 * to go
		 * 
		 */

		int votingAge = 18;
		Scanner input = new Scanner(System.in);

		System.out.println("How old are you?");
		int yourAge = input.nextInt();

		if (votingAge <= yourAge) {
			System.out.println( "You are eligible to vote. \nYou have been eligible for " 
							+ (yourAge - votingAge) + " years");
		} else {
			System.out.println( "You are not eligible to vote. \nYou still have " 
							+ (yourAge - votingAge) + " years to go");

		}

	}

}
