package day28_multid_arrays;

import java.util.Arrays;

public class ReverseSentence {

	public static void main(String[] args) {

		String sentence = "Very are interesting abc person olive the indeed you";
		
		String[] strArray = sentence.split(" ");
	    
	    

		String[] sentenceArray = sentence.split(" ");
		String reverse = "";

		int count = 0;
		for (int i = sentenceArray.length - 1; i >= 0; i--) {
			reverse += sentenceArray[i] + " ";
		}
		System.out.println(reverse.trim());
		
	}

}
