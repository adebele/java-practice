package day23_arrays_and_loops;

public class PrintLetterNestedLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (char letter = 'a'; letter <= 'z'; letter++) {
				System.out.print(letter);
			}
			System.out.println();
		System.out.println("**************************");
		}
	}
}
