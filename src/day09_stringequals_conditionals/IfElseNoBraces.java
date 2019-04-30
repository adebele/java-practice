package day09_stringequals_conditionals;

public class IfElseNoBraces {

	public static void main(String []args) {
		
		String day = "Tuesday";
	//if else statement without any curly braces will only execute a single line of command
		
		
		if (day.equals("Tuesday"))
			System.out.println("Today is Tuesday");
			//System.out.println("Tuesday"); <= this line would not execute because it is inside the if else block
		else 
			System.out.println("Today is not Tuesday");
			//System.out.println("Tuesday is not today"); <= this line would still execute because it is after the if else block
	}
}
