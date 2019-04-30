package day14_string_manipulation;

public class CharAt {
	public static void main(String[] args) {
		
		String word = "Comp uter";
		
		System.out.println(word.length());
		//print all characters one by one
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		System.out.println(word.charAt(8));
		//System.out.println(word.charAt(9));
		
		
		//String word2 and check if first character is 'J'
		
		String word2 = "java";
		
		//boolean first = word2.charAt(0) == 'j';
		//System.out.println(first);
		//System.out.println(word2.charAt(0) == 'j');
	
		if (word2.charAt(0)== 'J') {
			System.out.println("J is first char");
		}else {
			System.out.println("J is not first char");
		}
	
		//String word3 that consist of 5 characters
		//check if first and last character are same
		// true => "first and last match"
		// False => "first and last are different"
		
		String word3 = "level";
		
		if (word3.charAt(0) == word3.charAt(4)) {
			System.out.println("first and last word match");
		}else {
			System.out.println("Do not match");
		}
		
		//String word4 => always print the last character 
		//no matter the length
		
		String word4 = "Automation";
		
		char lastChar = word4.charAt(word4.length()-1);
		System.out.println("Last char of "+ word4+" is "+lastChar);
		
		
		
	}
}
