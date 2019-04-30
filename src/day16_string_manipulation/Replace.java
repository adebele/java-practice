package day16_string_manipulation;

import java.util.Scanner;

public class Replace {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Type words: ");
		
		String words = scan.nextLine();
		System.out.println(words.replace("a", "y"));
		System.out.println();
	}
}	
