package day31_methods03_042019;

import java.util.Arrays;

public class MethodsWithStrings {
	public static void main(String[] args) {

		countWords("Java is fun");
		countWords("No class tomorrow");
		googleSearchResults("About 860,000,000 results (0.87 seconds)");
		googleResultwithArray("About 860,000,000 results (0.87 seconds)");
	}

	public static void countWords(String sentence) {
		String[] sentenceArray = sentence.split(" ");
		System.out.println("Number of words: " + sentenceArray.length);
		System.out.println(Arrays.toString(sentenceArray));
	}

	public static void googleSearchResults(String searchResult) {
		searchResult = searchResult.replaceAll(",", "");
		System.out.println("Results count: "
				+ searchResult.substring(searchResult.indexOf("About") + 5, searchResult.indexOf("result") - 1));
		System.out.println("Time in seconds: "
				+ searchResult.substring(searchResult.indexOf("(") + 1, searchResult.indexOf("seconds") - 1));
	}

	public static void googleResultwithArray(String searchResults) {
		searchResults = searchResults.replace(",", "");
		searchResults = searchResults.replace("(", "");

		String[] resultsArray = searchResults.split(" ");
		System.out.println("Results count: " + resultsArray[1]);
		System.out.println("Time in seconds: " + resultsArray[3]);

	}

}
//About 860,000,000 results (0.87 seconds)