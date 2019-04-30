package day23_arrays_and_loops;

public class PrintLettersNestedLoopV2 {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {

			// i -- is an index
			// if index is even (it means 2,4, 6, 8,...) print from a till z
			if (i % 2 == 0) {
				for (char letter = 'a'; letter <= 'z'; letter++) {
					System.out.print(letter);
				}
				
				// if index is odd(it means 1, 3, 5, ...) print from z till a
				
			} else {
				for (char letter = 'z'; letter >= 'a'; letter--) {
					System.out.print(letter);
				}

			}
			
			System.out.println();
			System.out.println("**************************");
			
		}
	}
}