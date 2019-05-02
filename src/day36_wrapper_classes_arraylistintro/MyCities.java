package day36_wrapper_classes_arraylistintro;

import java.util.ArrayList;

public class MyCities {
	public static void main(String[] args) {
			
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("Barnaul");
		cities.add("Sterling");
		cities.add("Mclean");
		cities.add("Addis Ababa");
		cities.add("Baku");
		cities.add("Sterling");
		
		//print each city using for each loop, separated by space
		for(String city: cities) {
			System.out.print(city+", ");
		}
		System.out.println();
		//print each city using for loop, separated by space
		
		for(int i=0; i<cities.size();i++) {
			System.out.print(cities.get(i)+", ");
		}
		System.out.println();
		
		
		cities.remove("Sterling");
		System.out.println(cities.toString());
	
		//isEmpty?
		System.out.println("Is list Empty: "+ cities.isEmpty());
		cities.add(0, "Bishkek");
		
		System.out.println(cities.toString());
		
		cities.add(1, "Istanbul");
		System.out.println(cities.toString());
		
	
		cities.set(2, "Seoul");
		System.out.println(cities.toString());
		
		//find sterling in the list and give the index
		int idx = cities.indexOf("Sterling");
		System.out.println("Sterling index: "+ idx);
		
		cities.set(idx, "Zagreb");
		
		System.out.println(cities.toString());
		
		cities.clear(); //removes all values from list
		boolean empty = cities.isEmpty();
		System.out.println("Cities is empty: "+empty);
		
	}
}
