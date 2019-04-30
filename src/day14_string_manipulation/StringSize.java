package day14_string_manipulation;

import java.util.*;
public class StringSize {

	public static void main(String[] args) {
/*
		String str1 = "Good Morning";
		// check if it matches "Good Morning" and print match or not match

		if (str1.contentEquals("Good Morning")) {
			System.out.println("Match");
		} else {
			System.out.println("Not Match");
		}
		

		if (str1.equalsIgnoreCase("good morning")) {
			System.out.println("Match - ignore case");
		} else {
			System.out.println("Not Match - ignore case");
		}
		

		// Convert to All Uppercase and print
		// str1 = str1.toUpperCase(); this will make the string all uppercase and assign it to the variable
		System.out.println(str1.toUpperCase());//this won't change the variable it will just convert and display the data.
		System.out.println(str1);

	
		//combine the above methods together:
		//convert to all lowercase first then check if it equals("good morning")
		
		if (str1.toLowerCase().contentEquals("good morning")) {
			System.out.println("Chained methods: match");
		}else {
			System.out.println("Chained methods: do not match");
		}
	
		//FIND OUT HOW MANY CHARACTERS IN THE STRING
		
		String myName = "Abiy";
		System.out.println(myName.length());
		
		int length = myName.length();
		System.out.println("My name's length is "+length);
		
		//username must be exactly 8 characters.
		
		String userName = "Abiy";
		if (userName.length() == 8) {
			System.out.println("Valid username");
		}else {
			System.out.println("Invalid username, username must be 8 charcters");
		}
		
		String password = "";
		
		if (password.length()>=6) {
			System.out.println("Valid password");
		}else {
			System.out.println("Invalid password");
		}
		
		int passwordLength = password.length();
		if (passwordLength>=6) {
			System.out.println("valid password");
		}else {
			System.out.println("Invalid password. Too short");
		}
	*/	
		
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter 2 words:");
	String word1 = scan.next();
	
	String word2 = scan.next();
	
	if (word1.length()>word2.length()) {
		System.out.println(word1+" is longer than "+word2);
	}else if(word1.length()<word2.length()) {
		System.out.println(word2+" is longer than "+word1);
	}else {
		System.out.println(word1+" is the same length as "+word2);
	}
	
	
	
	
	
	
	}
}
