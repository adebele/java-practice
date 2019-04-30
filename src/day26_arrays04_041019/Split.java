package day26_arrays04_041019;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		String words = "java,kava,html,selenium";
		String[] wordsArray = words.split(",");
		System.out.println("Count: " + wordsArray.length);
		System.out.println(wordsArray[0]);

		System.out.println(Arrays.toString(wordsArray));

		for (String word : wordsArray) {
			System.out.println(word);
		}

		String diceResult = "1 - 20 of 1,461 positions";
		// using split method, print 1,461

		String[] result = diceResult.split(" ");
		System.out.println("Search result total: " + result[4]);

		String[] diceArray2 = diceResult.split(" of ");
		System.out.println(diceArray2[0].trim());
		System.out.println(diceArray2[1].trim());

		String sentence2 = "I felt happy because I saw the others were "
				+ "happy and because I knew I should feel happy, " + "but I wasn’t really happy.";

		String[] allWords = sentence2.split(" ");
		String[] happySplit = sentence2.split("happy");
		String[] ISplit = sentence2.split("I");

		System.out.println(Arrays.toString(allWords));
		System.out.println(Arrays.toString(happySplit));
		System.out.println(Arrays.toString(ISplit));

		
		System.out.println();
		String word = "java is fun.";
		char[] charsArray = word.toCharArray();

		for(char ch: charsArray) {
			System.out.println(ch);
		}
	}

}
