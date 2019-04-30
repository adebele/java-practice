package day31_methods03_042019;

public class Counter {

	public static void main(String[] args) {
		countUp(5);

		countDown(0);
		
	}

	public static void countUp(int num) {

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("Invalid input");
		}
		System.out.println();

	}

	public static void countDown(int num) {

		if (num > 0) {
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}else{
			System.out.println("Invalid input");
		}
		System.out.println();

	}

}
