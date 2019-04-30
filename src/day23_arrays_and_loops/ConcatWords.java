package day23_arrays_and_loops;

import java.util.*;
public class ConcatWords {
	public static void main(String[] args) {
		
		String word = "";
		String totWords = "";
		Scanner scan = new Scanner (System.in);
		for(int i=0; i<=6; i++) {
			System.out.println("Please enter word");
			word = scan.next();
			if(word.contains("java")) {
				continue;
			}
			totWords+= word+", ";
			
		}
	System.out.println(totWords);	
	}

}
