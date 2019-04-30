package day09_stringequals_conditionals;

import java.util.*;

public class Canada {

	public static void main (String[] args) {
		
		System.out.println("What is the capital of Canada?");
		
		Scanner keyboard = new Scanner(System.in);
		
		String capital = keyboard.nextLine();
		
		if (capital.equalsIgnoreCase("Ottawa")){
			System.out.println("Your answer is correct");
		}else
			System.out.println("Your answer is incorrect! "+capital
					+" is not capital of Canada");
		}
		
/*		equalsIgnoreCase method of string, ignores  uppercase of lowercase 
 * 		difference when checking for equality.
 		
 		if (capital.equals("Ottawa")){
			System.out.println("Your answer is correct");
		}else
			System.out.println("Your answer is incorrect! "+capital
					+" is not capital of Canada");
*/		
	}

