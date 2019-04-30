
package day07_Scanner_operator;

public class ComparisonOperators {

	public static void main(String[] args) {

		/*
		 * == - equals 
		 * != - not equals 
		 * > - greater than 
		 * >= - greater or equal 
		 * < - less
		 * than <= - less than or equals
		 */
	
		System.out.println(5==5); //true
		System.out.println(50==5); //false
	
		int searchCount = 5000;
		System.out.println(searchCount == 5000);//true
	
		int expectedCount = 5010;
		System.out.println(searchCount == expectedCount); //false
		
		System.out.println("\n");
		
		int speedLimit = 55;
		int currentSpeed = 75;
		
		System.out.println(currentSpeed == speedLimit);
		
		boolean atLimit = currentSpeed == speedLimit;
		
		System.out.println("At Speed Limit: "+atLimit);
		
		boolean overLimit = currentSpeed > speedLimit;
		System.out.println("Over speed limit: "+ overLimit);
		
		boolean underLimit = currentSpeed < speedLimit;
		//boolean underLimit = speedLimit > currentSpeed;

		System.out.println("Under limit: "+underLimit);

		System.out.println("\n");
		
		double balance = 150.0;
		boolean broke = balance <= 0.0;
		
		System.out.println("Broke? - "+ broke);
		
		double transaction = 155.5;
		
		broke = (balance - transaction) < 0;
		System.out.println("WIll make broke/negative? - " +broke);
		
		System.out.println("Balance: "+ balance);
		System.out.println("Transaction: "+transaction);
		System.out.println("\n");
		
		
		
		
		
		
	
	}

}
