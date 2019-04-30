package day23_arrays_and_loops;

public class StringsArray {

	public static void main(String[] args) {
		
		String [] names = new String[5];
		String [] names2 = {"apple", "orange", "banana", "carrot", "cucumber"};
		
		System.out.println("Number of items: "+names2.length);
		
		System.out.println(names2[names2.length-1]);

		//for each loop stand for collections of data
		// we need specify data type, variable name : our collection of data
		for(String fruit: names2) {
			System.out.println(fruit);
		}
		
	}

}
