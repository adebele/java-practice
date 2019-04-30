package day22_loopspractice2;

public class LookForWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "He said hi, then she replied hi. hi guys!";
		
		for (int n = 0; n < sentence.length()-1; n++) {
			System.out.println(sentence.substring(n, n + 2));
		}
	}

}
