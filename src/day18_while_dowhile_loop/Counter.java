package day18_while_dowhile_loop;

public class Counter {
	public static void main(String[] args) throws InterruptedException {
		
		int num = 1;
		while(num<10) {
			System.out.print(num+", ");
			num++;
			Thread.sleep(500); //slows down the code to half a second
		}
		System.out.println(num);
	
	
	int num2 = 10;
	while(num2>1) {
		System.out.print(num2+", ");
		num2--;
		Thread.sleep(250);
	}
	System.out.print(num2);
	}
}
