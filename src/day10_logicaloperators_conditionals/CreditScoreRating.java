package day10_logicaloperators_conditionals;

import java.util.*;

public class CreditScoreRating {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your credit score:");

		 int score = scan.nextInt();
		//int score = 800;
		if ((score >= 750) && (score <= 850)) {
			System.out.println("Excellent");
		} else if ((score >= 700) && (score <= 749)) {
			System.out.println("Good");
		}else if ((score >= 650) && (score <= 699)) {
			System.out.println("Fair");
		}else if ((score >= 550) && (score <= 649)) {
			System.out.println("Poor");
		}else if ((score >= 0) && (score <= 549)) {
			System.out.println("Bad");	
		}else {
			System.out.println("Invalid Score");
		}
	}
}
