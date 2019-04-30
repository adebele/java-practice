package day06_operators2;

import java.util.Scanner;

public class ScannerYourName {

	public static void main(String[] args) {

		// create scanner object
		Scanner input = new Scanner(System.in);

	System.out.println("Hi, what is your name? ");
	
	String name = input.next();  //accept String input 
	//String name = input.nextLine(); if needed to read whole line.

	System.out.println("Nice to meet you, "+ name);

	
	
	
	}

}
