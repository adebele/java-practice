package day23_arrays_and_loops;

public class PrintNumberWithLoop {

	public static void main(String[] args) {

		// this is just to print numbers from 1 to 10

		/*
		 * for (int i = 1; i <= 10; i++) { System.out.println(i + " "); }
		 * System.out.println(); for (int i = 1; i <= 10; i++) { System.out.println(i +
		 * " "); }
		 * 
		 */

		// Nested Loop

		// outer loop
		for (int k = 1; k <= 3; k++) {
			
			for (int j = 1; j <= 5; j++) { // ==> runs the inside loop 5 times
				// inner loop
				
				for (int i = 1; i <= 10; i++) {// ==> runs/prints the code in the inner loop
					System.out.print(i + " ");
				}

				System.out.println();

			}
			System.out.println("**********************");
		}
	}

}
