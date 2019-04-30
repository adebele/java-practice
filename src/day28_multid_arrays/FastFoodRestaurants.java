package day28_multid_arrays;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FastFoodRestaurants {
	public static void main(String[] args) throws IOException {
		// read all data and assign to array

		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);

		System.out.println("Data size: " + data.length);

		System.out.println(data[0]);
		System.out.println(data[1]);
		// last restaurant
		System.out.println(data[data.length - 1]);

		// print each Restaurant information in separate line
		int counter = 1;
		for (String restaurant : data) {
			// System.out.println("#"+counter+"=>"+restaurant);
			counter++;
		}

		// print all restaurant information in state of VA
		int counter2 = 1;
		for (String restaurant : data) {
			if (restaurant.contains("VA,")) {
				System.out.println("#" + counter2 + "=>" + restaurant);
				counter2++;
			}
		}
		// Find all restaurant information in state of VA
		// print the restaurant names along with cityName.
		// Subway - Herndon
		
		for (String restaurant : data) {
			if (restaurant.contains("VA,")) {
				String [] restArr = restaurant.split(",");
				System.out.println(restArr[2]+" - "+restArr[1]);
				
			}
		}

	}
}
