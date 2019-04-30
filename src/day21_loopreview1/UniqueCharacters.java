package day21_loopreview1;

import java.util.*;

public class UniqueCharacters {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String word ;
		String unique = "";
		System.out.println("Enter word:");
		word = scan.next();
		
		/*	char letter ;
		
		int i = 0;
		while(i<word.length()) {
			
			letter = word.charAt(i);
			if(!(unique.contains(""+letter))) {
				unique += letter;
			}			
			i++;
	
		}
*/
		
		for (int i = 0; i< word.length(); i++) {
			//System.out.println(i); print i. it increases the index
			System.out.println(word.charAt(i));
		}
	System.out.println(unique);
	
	}
}