package day28_multid_arrays;

import java.util.Arrays;

public class FootballTeams {
	public static void main(String[] args) {

		String[][] teams = new String[2][6];
		teams[0][0] = "Irina";
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Adel";
		teams[0][5] = "Bojan";

		teams[1][0] = "Olimjon";
		teams[1][1] = "Mirshod";
		teams[1][2] = "Usman";
		teams[1][3] = "Nursultan";
		teams[1][4] = "Mohammed";
		teams[1][5] = "Kanan";

		System.out.println("First player of first team: " + teams[0][0]);
		System.out.println(teams[0][3]);

		System.out.println("Number of rows: " + teams.length);
		System.out.println("People of in first team: " + teams[0].length);
		System.out.println("People in second team: " + teams[1].length);

		System.out.println(Arrays.toString(teams[0]));

		int[][] nums = new int[3][4];

		nums[0][0] = 100;
		nums[0][1] = 34534;
		nums[0][2] = 342342;
		nums[0][3] = 7829;

		nums[1][0] = 256;
		nums[1][1] = 123256;
		nums[1][2] = 62453;
		nums[1][3] = 2562;

		nums[2][0] = 256;
		nums[2][1] = 123256;
		nums[2][2] = 62453;
		nums[2][3] = 2562;

		System.out.println(Arrays.deepToString(nums));

		System.out.println(Arrays.toString(nums[0]));

		int[][] scores = { { 3, 5, 10 }, { 6, 4, 2, 10 } };

		System.out.println("Days played/Number of arrays: " + scores.length);
		System.out.println("Number of values in 1st: " + scores[0].length);
		System.out.println("Number of values in 2nd: " + scores[1].length);

		int[][] values = new int[4][]; // we have to specify the amount of rows but the number of values can be
										// declared later.
		values[0] = new int[] { 34, 23, 5 };
		values[1] = new int[] { 34, 123, 4345, 645623345 };
		values[2] = new int[2];
		values[2][0] = 55;
		values[2][1] = 88;
		
		values[3] = new int[] {5, 12, 45, 77, 34};
		System.out.println(Arrays.deepToString(values));
		

	}
}
