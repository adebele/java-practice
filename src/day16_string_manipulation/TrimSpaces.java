package day16_string_manipulation;

public class TrimSpaces {
	public static void main(String[] args) {
		
		String word1 = " String methods ";
		System.out.println(word1.trim());//trims the spaces at the beginning and the end of the string
		
		String word2 = "     Threespaces here ";
		System.out.println(word2.trim());
		
		String word = "Java";
		word = word.concat(" is fun.");
		System.out.println(word);
		
		word = word.concat("123");
		word = word+456;
		System.out.println(word);
		
		String word3 ="Hi";
		word3 = word3.concat("-hey").concat("-how are you").concat("-good")+123;
		System.out.println(word3 );
		
		
		
	}
}
