package day39_arraylist04_050519;

import java.util.*;

public class WarmUp {
	public static void main(String[] args) {

		ArrayList<String> cities = new ArrayList<>();

		cities.add("Tokyo");
		cities.add("New York");
		cities.add(0, "Paris");
		cities.add("Pittsburgh");
		cities.add(1, "Berlin");
		cities.add("Madrid");
		cities.add("Moscow");
		cities.add("Istanbul");
		cities.add("Washington D.C.");
		cities.add("Amsterdam");
		cities.add("Zurich");
		cities.add("Singapore");
		cities.add("Milan");
		cities.add("Toronto");
		cities.add("London");

		for (String city : cities) {
			System.out.print(city + " | ");
		}

		System.out.println();
		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i) + " | ");
		}

		System.out.println();

		System.out.println(cities.toString().toUpperCase());

		for (int i = 0; i < cities.size(); i++) {
			cities.set(i, cities.get(i).toUpperCase());

		}

		System.out.println(cities);

		String shortC = cities.get(0), longC = "";

		for (String city : cities) {
			if (city.length() > longC.length()) {
				longC = city;
			}
			if (city.length() < shortC.length()) {
				shortC = city;
			}
		}

		System.out.println("Shortest City: "+shortC);
		System.out.println("Longest City: "+longC);
		
		
		
		ArrayList<String> citiesMoreThan6 = new ArrayList<>();
		//assign all cities that have more than 6 chars to this array
		
		
		for(String city: cities) {
			if(city.length()>6) {
				citiesMoreThan6.add(city);
			}
		}
		
		System.out.println(citiesMoreThan6);
		
		
		
	}
}
