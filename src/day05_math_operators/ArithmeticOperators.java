package day05_math_operators;

public class ArithmeticOperators {

	public static void main(String[] args) {

		// + - addition operator
		System.out.println(55 + 5);

		int chairs = 140;
		System.out.println(chairs + 2);

		int moreChairs = chairs + 5;
		System.out.println(moreChairs);

		int tables = 130;
		int total = tables + chairs;
		System.out.println(total);

		// - Subtraction. Minus
		System.out.println(500 - 123);

		int result = 44 - 23;
		System.out.println(result);

		double balance = 1200.50;
		double transaction = 56.44;
		
		System.out.println(balance - transaction);
		System.out.println(balance = balance - transaction);
		System.out.println(balance);
	
		int linesOfCode = 50;
		System.out.println("Lines of code "+ 50);
		linesOfCode = linesOfCode - 2;
		System.out.println("Lines of Code "+linesOfCode);
		
		//multiplication
		System.out.println(22*2);
		
		//declare variables classes and assign 5
		//muliply linesOfCode
	
		int classes = 5;
		System.out.println(classes * linesOfCode);
		
		int totalLinesOfCode = linesOfCode * classes;
		System.out.println("totalLinesOfCode="+totalLinesOfCode);
		
		
		//Division operator
		System.out.println(10/3);
		System.out.println(55/5);
		System.out.println(10.0/3);
		System.out.println(15/7);
		System.out.println(15.0/7);
		System.out.println(5%2);
		
		
		
	}
	
	

}
