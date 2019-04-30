package day16_string_manipulation;

public class GetNumberFromString {
	public static void main(String[] args) {

		String sentence = "I wrote [23] lines of code today";
		// print the number between [ and ]

		int first = sentence.indexOf("[") + 1;
		int last = sentence.indexOf("]");

		String codeCount = sentence.substring(first, last);
		System.out.println("Lines of code: " + sentence.substring(first, last));

		// check if codeCount is more than 10
		int count = Integer.parseInt(codeCount);

		if (count > 20) {
			System.out.println("Wrote more than 20 lines of code today!");
		} else {
			System.out.println("Not enough codeing for today.");
		}
		
		//SUBSTRING with one input will print starting from that index all the way to end of the string
		
		String word = "java";
		
		System.out.println(word.substring(2));//will print out "va"
		
	}
}
