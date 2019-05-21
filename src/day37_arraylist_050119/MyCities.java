package day37_arraylist_050119;

import java.util.ArrayList;

public class MyCities {
	public static void removeAll(ArrayList<String> wordList, String targetWord){
		   
		   ArrayList<String> arrNew = new ArrayList<>();
		   /*  arrNew.add(targetWord);
		    wordList.removeAll(arrNew);
		    System.out.println(wordList);
		    */
		   
		   for(int i=0;i<wordList.size();i++){
		     if(!(wordList.get(i).equals(targetWord)))
		     arrNew.add(wordList.get(i));
		   } 
		   System.out.println(arrNew);
		}
	
	public static void main(String[] args) {
			
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("Barnaul");
		cities.add("Sterling");
		cities.add("Sterling");
		cities.add("Mclean");
		cities.add("Addis Ababa");
		cities.add("Baku");
		cities.add("Sterling");
		
		removeAll(cities, "Sterling");
		
		
		ArrayList<String> cir = new ArrayList<>();
		cir.addAll(0, cities);
		System.out.println(cir);
		
		
		
		System.out.println(combineAl(cities, cir));
		
		
		
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

	public static ArrayList<String> combineAl (ArrayList<String> wordList1, ArrayList<String> wordList2){
		  ArrayList<String> combine=new ArrayList<>();
		  combine.addAll(0,wordList1);
		  combine.addAll(wordList1.size(), wordList2);
		  
		  return combine;
		  
		}

}

