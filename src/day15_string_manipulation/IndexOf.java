package day15_string_manipulation;

public class IndexOf {
	public static void main(String[] args) {
		String word1 = "github";

		System.out.println(word1.indexOf('g'));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("tu"));

		String url = "www.okta.com";
		int index = url.indexOf(".");
		System.out.println("Pos of . :" + index);
		System.out.println(url.charAt(index + 1));

		String title = "Java - Google Search";
		// find position of '-" and check if space is on right and left side

		if ((title.charAt(title.indexOf("-") - 1) == ' ') && (title.charAt(title.indexOf("-") + 1) == ' ')) {
			System.out.println("There are spaces on the right and left");

			String country = "United States of America";
			int states = country.indexOf("States");
			System.out.println("Position of states: " + states);
			
			
			String word2 = "Java, c++, phyton";
			if (word2.contains("c++")) {
				System.out.println("C++ is there");
			} else {
				System.out.println("c++ is not there");
			}

			if (word2.indexOf("c++") == -1) {
				System.out.println("c++ is not there");
			} else {
				System.out.println("c++ is there");
			}

			/* String methods:
			 * equals
			 * equalsIgnoreCase
			 * toUpperCase
			 * toLowerCase
			 * charAt
			 * length
			 * startsWith
			 * endsWith
			 * contains
			 * indexOf
			 * lastIndexOf
			 * subString
			 * replace
			 */
			
			
			
			
		}
	}
}
