package day08_casting_conditionals;

public class IfElseWithVariables {

	public static void main(String[] args) {

		int temperature = 45;

		if (temperature >= 67) {

			System.out.println("It is a nice day! Lets code java");
		} else {
			System.out.println("Stay home and code java");
		}

		// Two int variables, teamAScore, TeamBScore
		// put a condition. check if teamA won.

		// "Team A won."
		// Go to Team A!
		// else "team b won or it was a draw"
		// Go Teams!

		int teamAScore = 2, teamBScore = 3;

		if (teamAScore > teamBScore) {
			System.out.println("Team A won.");
			System.out.println("Go Team A!");
		}
		//if (teamAScore == teamBScore) {
			//System.out.println("It was a tie");}
		else {
			System.out.println("team b won ot it was a draw");
			System.out.println("Go Teams!");
		}

	}

}
