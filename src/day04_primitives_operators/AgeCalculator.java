package day04_primitives_operators;

public class AgeCalculator {
	public static void main(String[] args) {
	//Declare variable yearOfBirth and assign some year 
	
		int yearOfBirth = 2006;
		
	//Declare variable currentYear and assign 2019
		
		int currentYear = 2019;
		
	//Declare variable age and calculate the age and
	//assign result to it
		
		int age = currentYear - yearOfBirth;
		
	System.out.println("If you are born in year "+ yearOfBirth + ", then you are "+ age +" years old.");
	}
}
