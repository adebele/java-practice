package day19_loops;

public class DoWhile {
	public static void main(String[] args) {
		
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
		}while (i <=10);
	
	int sum = 0;
	int j = 1;
	
	// use a DoWhile loop to find the sum of numbers from 1 to 5
	do {
		sum +=j;
		j++;
	}while (j <=5);// check the condition at the bottom.
	
	System.out.println("Sum from 1 to 5 is "+ sum);
	
	
	}
}
