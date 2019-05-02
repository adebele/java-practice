package day37_arraylist_050119;

import java.util.ArrayList;

public class Shopping {
	public static void main(String[] args) {
		
		
		ArrayList<String> shoppingList = new ArrayList<>();
		
		shoppingList.add("shoes");
		shoppingList.add("hat");
		shoppingList.add("pants");
		shoppingList.add("socks");
		shoppingList.add("shirt");
		shoppingList.add("gloves");
		
		//print number of items
		int count = shoppingList.size();
		System.out.println("Total count: "+count);
		System.out.println(shoppingList.size());
		
		//print all items in single line
		System.out.println(shoppingList);
		System.out.println(shoppingList.toString());
		
		//print first and last item in single line
		System.out.println(shoppingList.get(0));
		System.out.println(shoppingList.get(count-1));
		System.out.println(shoppingList.get(shoppingList.size()-1));
		
		shoppingList.remove("socks");
		shoppingList.remove("pants");
		System.out.println(shoppingList);
		System.out.println(shoppingList.get(0));
		shoppingList.remove(0);
		System.out.println(shoppingList);
		
		
		for(String item : shoppingList) {
			System.out.println(item);
		}
		
		//remove all items at once
		shoppingList.clear();
		System.out.println(shoppingList.toString());
		
		
		double d = 90.0;
		System.out.println(d);
	
	}
}
