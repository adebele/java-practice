package day19_loops;

import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter word to test:");
		String word = scan.next();
		String reversed = "";
		//loop through word in reverse order and 
		//concetnate each character to reversed string
		
		int idx = word.length()-1;
		while(idx>=0) {
			reversed +=word.charAt(idx);
			idx--;
		}
		if(word.equalsIgnoreCase(reversed)) {
		System.out.println("It is palindrome.");
		}else {
			System.out.println("It is not palindrome.");
		}
		
	}

}
