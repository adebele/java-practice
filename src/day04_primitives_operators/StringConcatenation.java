package day04_primitives_operators;

public class StringConcatenation {
	public static void main(String[] args) {
		// string variables called firstName and assign your firstName
		String firstName = "Abiy";

		// print out My name is Abiy.
		System.out.println("My name is " + firstName + ".");

		// city variables and assign city you are from
		// print: I was born in Addis.

		String city = "Addis Ababa";
		System.out.println("I was born in " + city);

		// Create a var: job and assign SDET to it
		// Create a var: company and assign any company
		// Print: I work as <SDET> in <company>.

		String job = "bartender", company = "The Brass Tap";
		System.out.println("I work as a " + job + " at " + company + ".");

		// create int variable zipcode and assign zip code of your home
		// print: I live in <20910> zipcode

		int zipcode = 20910;

		System.out.println("I live in " + zipcode + " zipcode.");

		//to print two integers without adding them
		int num1=10, num2=20;
		
		System.out.println(num1+" "+num2);
		
		
	}
}
