package day08_casting_conditionals;

public class Relationals {

	public static void main(String[] args) {

		double d1 = 23.56, d2 = 20.43;

		System.out.println(d1 >= d2);
		boolean check = d1 >= d2;

		System.out.println("Check: " + check);

		char ch1 = 'a', ch2 = 'j', ch3 = 'A';

		System.out.println(ch2 > ch1);
		System.out.println(ch1 > ch3);
		System.out.println(ch2 > ch3);

		boolean b = true == false;
		System.out.println("B: " + b);

		boolean c = true != false;
		System.out.println("C: " + c);

	}

}
