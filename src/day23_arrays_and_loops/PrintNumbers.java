package day23_arrays_and_loops;

public class PrintNumbers {

	public static void main(String[] args) {
		
		//print numbers from 1 to 20 but skip numbers from 5 to 10
		for(int i = 1; i<=20;i++) {
			if(i>=5 && i<=10)
				continue;
			System.out.println(i);
			
		}

	}

}
