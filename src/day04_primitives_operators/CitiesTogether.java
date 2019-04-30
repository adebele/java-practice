package day04_primitives_operators;

public class CitiesTogether {
	public static void main(String[] args) {

		/*
		 * Declare 3 String variables city1 city2 city3
		 * 
		 * Assign values: Kyiv Tashkent Moscow
		 */
		String city1 = "Kyiv", city2 = "Tashkent", city3 = "Moscow";

		/*
		 * Print: From Tashkent to Kyiv is $500 From Moscow to Tashkent is $550 I have
		 * been to Tashkent, Moscow, Kyiv.
		 */

		System.out.println("From " + city2 + " to " + city1 + " is $500." 
				+ "\nFrom " + city3 + " to " + city2 + " is $550."
				+ "\nI have been to " + city2 + ", " + city3 + ", " + city1 + ".");

		
		String app = "Slack";
		
		//We use <Slack> for messaging with classmates.
		
		System.out.println("We use "+app +" for messaging with classmates.");
		
		
	
		
	}
}
