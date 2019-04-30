package day16_string_manipulation;

public class ReplaceThem {
	public static void main(String[] args) {
		String sentence = "Coding is fun, it is my hobby!";
		String withNoSpaces = sentence.replace(" ", "");
		
		
		System.out.println(withNoSpaces);
		sentence = sentence.replace(",", "!!");
		System.out.println(sentence);
		
		String mixed = "*(&&*j(a@#va*(@#!";
		
		//chaining replace
		mixed = mixed.replace("!", "").replace("@", "").replace("#", "").replace("@", "").replace("*", "").replace("&", "").replace("(", "");
		System.out.println(mixed);
		
		//using string methods get just the amount of results
		String result = "About 115,000,000 results (0.59 seconds)";
		
		result = result.replace("About ", "");
		result = result.substring(0, result.indexOf(" "));
		
		System.out.println(result);
		
		result = result.replaceFirst(",", "");
		result = result.replaceFirst(",", "");
		System.out.println(result);
		
		
	}
}
