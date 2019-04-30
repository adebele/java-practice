
package day06_operators2;

public class OperatorsPrecedence {

	public static void main(String[] args) {

		//If string is first then '+' is used for concatenation
		System.out.println("Hello " + 6 + 10);
		
		//If numerical value is first then '+' is used as an arithmetic operator first
		System.out.println(6 + 10 + " Hello");
		
		System.out.println("Hello " + (6 + 10));
	}

}
