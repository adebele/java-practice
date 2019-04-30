package day17_stringpool_whileloop;

public class WhileLoop1 {

	public static void main(String[] args) {

		int n1 = 100, n2 = 140;

		while (n2 > n1) { // true
			System.out.println("N2 is greater");
			// n1 = n1+10;
		}
		//the above loop is infinite loop
		//the condition n2>n1 will always be true, and never becomes false.
		//While loop keeps executing as long as the condition is true.
		System.out.println("END");
	}

}
