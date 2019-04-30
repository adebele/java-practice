package day08_casting_conditionals;

public class CastingPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int i = 3.4;

		int i = (int) 3.4;

		System.out.println("i: " + i);

		double price = 230.50;

		int dollars = (int) price;
		System.out.println("Price: " + price);
		System.out.println("Dollars: " + dollars);
		
		//Whole number. byte, short, int
		
		int count = 120;
		//byte byteCount = count; won't work
		
		byte byteCount = (byte) count;
	
		System.out.println("Count: "+count);
		System.out.println("byteCount: "+byteCount);
		
		long longValue = 345645L;
		
		int intValue = (int) longValue;
		
		System.out.println("Int Value: "+intValue);
		
		int large = 5678;
		short small = (short) large;
		
		System.out.println("Small: "+ small);
		
		int result =  (int) (500.4/2.0);
		
		

	}

}
