package day23_arrays_and_loops;

public class PrimeNumbers {
	public static void main(String[] args) {
		int num = 400;
		int num2 = 1;
		
		/*for (int i = 2; i <= num; i++) {
			
			if(num%i==0) {
				continue;
			}
		}
			System.out.println("Prime number: "+num);
		*/
		
		for (int i = 2; i <num ; i++) {
			if (num%i ==0) {
				System.out.println("this is not a prime number");
				return;
			}
	}
		System.out.println("this is a prime number");
		
		
		}
	}
