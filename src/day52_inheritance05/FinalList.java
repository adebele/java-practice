package day52_inheritance05;

import java.util.*;

public class FinalList {
	public static void main(String[] args) {
		final ArrayList<String> COLORS = new ArrayList<>();
		COLORS.add("Orange");
		COLORS.add("Grey");
		COLORS.add("White");
		COLORS.add("BLUE");
		
		System.out.println(COLORS.toString());
		COLORS.add("Black");
		System.out.println(COLORS.toString());

		//COLORS = new ArrayList<>(); //new object not possible on a final ArrayList
		System.out.println(COLORS.toString());
		

		String num = "abiy";
		Character ch = 'a';
		System.out.println(ch.isAlphabetic(num.charAt(1)));
		
	}
}
