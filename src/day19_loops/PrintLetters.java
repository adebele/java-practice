package day19_loops;

public class PrintLetters {
	public static void main(String[] args) {
		String word = "Amazon";
		int idx = 0;
		//System.out.println(word.charAt(idx));
		//idx++;
		//System.out.println(word.charAt(idx));
		
		while (idx < word.length()) {
		System.out.println(word.charAt(idx++));
		}
		//1. TRUE idx = 0 A
		//2. TRUE idx = 1 M
		//3. TRUE idx = 2 A
		//4. TRUE idx = 3 Z
		//5. TRUE idx = 4 O
		//6. TRUE idx = 5 N
		//7. FALSE
	
		int idx2 = word.length() - 1;
		
		while (idx2 >=0) {
		System.out.println(word.charAt(idx2--));
		
		}
	
	
	
	
	}
}
