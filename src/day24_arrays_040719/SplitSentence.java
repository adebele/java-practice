package day24_arrays_040719;

public class SplitSentence {
	public static void main(String[] args) {
		String sentence = "Java is a general-purpose computer-programming language that is concurrent, "
				+ "class-based, object-oriented, and specifically designed to have as few implementation "
				+ "dependencies as possible.";

		String[] words = sentence.split(" ");
		int counter =0;
		for(String str: words) {
			if(str.contentEquals("language")) {
				break;
			}
			counter++;
		}
		
		System.out.println("Position:"+counter);
		System.out.println(words[counter]);
		
		
		
		
		for (String str : words) {
			System.out.println(str);
		}
		
		System.out.println();
		System.out.println(words[0]);
		
		
		/*String word2 = "dependencies";
		String [] letters = word2.split("");
		
		for(String str : letters) {
			System.out.println(str);
		}
		*/
	}
}
