package day29_methods01;

import java.util.Arrays;

public class Countries {

	public static void main(String[] args) {
		// String [][] countriesArray = {{"USA", "Canada", "Mexico", "Brasil", "Peru",
		// "Argentina", "Bolivia", "Macedonia", "Kazakhstan"},
		// {"Washington DC", "Ottawa", "Mexico city", "Brasilia", "Lima", "Buenos
		// Aires", "La Paz", "Skopje", "Nursultan"}};

		String[][] countriesArray = { { "USA", "Washington DC" }, { "Canada", "Ottawa" }, { "Mexico", "Mexico city" },
				{ "Brasil", "Brasilia" }, { "Peru", "Lima" }, { "Argentina", "Buenos Aires" }, { "Bolivia", "La Paz" },
				{ "Macedonia", "Scopia" }, { "Kazakhstan", "Nursultan" } };

		System.out.println(countriesArray[0][0] + " | " + countriesArray[0][1]);
		System.out.println(countriesArray[8][0] + " | " + countriesArray[8][1]);

		System.out.println();
		System.out.println(Arrays.deepToString(countriesArray));

		System.out.println();
		for (int i = 0; i < countriesArray.length; i++) {
			System.out.print(countriesArray[i][0] + " | ");
		}

		System.out.println("\n");
		for (String[] ar : countriesArray) {
			System.out.print(ar[0] + " | ");
		}

		// get all the cities and add to cities[] array

		System.out.println("\n");
		// String[] cities = new String[9];
		String[] cities = new String[countriesArray.length];

		for (int i = 0; i < countriesArray.length; i++) {
			cities[i] = countriesArray[i][1];

		}

		System.out.println(Arrays.toString(cities));

		for (int i = 0; i < countriesArray.length; i++) {
			if (countriesArray[i][0].equalsIgnoreCase("Bolivia")) {
				if (countriesArray[i][1].equalsIgnoreCase("La Paz")) {
					System.out.println("Bolivia test passed");
				} else {
					System.out.println("Bolivia test failed");
				}
				break;
			}
		}

	}

}
