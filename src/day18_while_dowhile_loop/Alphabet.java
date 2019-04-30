package day18_while_dowhile_loop;

public class Alphabet {
	public static void main(String[] args) {
		char letter = 'a';

		while (letter <= 'z') {
			System.out.print(letter + ", ");
			letter++;
		}

		System.out.println();
		
		char capitals = 'A';

		while (capitals <= 'Z') {
			System.out.print(capitals + ", ");
			capitals++;
		}
		System.out.println();
		
		char lowerCase = 'z';
		while (lowerCase > 'a') {
			System.out.print(lowerCase + ", ");
			lowerCase--;
		}
		System.out.println(lowerCase);
		System.out.println();
		
		
		String letters = "";
		while(lowerCase<='z') {
			letters = letters+""+lowerCase;
			System.out.println(letters);
			lowerCase++;
		}

	}
}
