package day40_customclasses_method;

import java.util.*;

public class WarmUpList {
	
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("Moon");
		myList.add("Sun");
		myList.add("Mars");
		myList.add("Saturn");
		myList.add("Venus");
		myList.add("Earth");
		myList.add("Sun");
		myList.add("Pluto");
		myList.add("Mercury");
		myList.add("Neptune");
		myList.add("Sun");
		
		System.out.println(countOccurences(myList, myList.get(1)));
		
		
	}
	public static int countOccurences(ArrayList<String> list, String word) {
		int count = 0;
		for (String str : list) {
			if (str.equals(word)) {
				count++;

			}
		}

		return count;
	}
}
