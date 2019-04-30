package day12_switch_ternary;

public class SwitchScore {

	public static void main(String[] args) {

		int score = 3;
		// 1 =>
		// 2 =>

		switch (score) {
		case 1:
			System.out.println("score is 1");
			break;
		case 2:
			System.out.println("score is 2");
			break;
		case 3:
			System.out.println("score is 3");
			break;
		default:
			System.out.println("Invalid score");
			break;// works without the break on the default case because there is nothing to run
					// after this statement.
		}

	}
}
