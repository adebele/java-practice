package day11_logical_nestedif;

public class LogicalBooleanValues {

	public static void main(String[] args) 
	{

		int g1 = 7;
		boolean b = 6 > 4 || (++g1 > 6);

		System.out.println("b: " + b);

		System.out.println("g1: " + g1);

		boolean c = 6 > 4 | (++g1 > 6);

		System.out.println("\nc: " + c);

		System.out.println("g2: " + g1);
		

		System.exit(0); // program stops here, comment-in to run below code
/*
		boolean A = true;
		boolean B = false;

		System.out.println("A|B = " + (A | B));
		System.out.println("A&B = " + (A & B));
		System.out.println("!A = " + (!A));
		System.out.println("A^B = " + (A ^ B));
		System.out.println("(A|B)&A = " + ((A | B) & A));

*/
		boolean b1 = 50 > 10 && 10 > 100;

		System.out.println("B1: " + b1);// false

		boolean b2 = 'a' == 'a' && 123 > 120;
	
		System.out.println("B2: " + b2);// true

		boolean b3 = true && 10 >= 10 && 1000 <= 900;

		System.out.println("B3: " + b3); // false

		boolean b4 = false && false && 10 == 10;

		System.out.println("B4: " + b4);// false

		boolean b5 = false && true || 10 == 10;

		System.out.println("B5: " + b5);// true because && has precedence

		boolean b6 = false && (true || 10 == 10);

		System.out.println("B6: " + b6);// false because the precedence is changed by the use of parentheses ()

		
		
	}

}
