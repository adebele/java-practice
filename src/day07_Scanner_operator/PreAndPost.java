package day07_Scanner_operator;

public class PreAndPost {

	public static void main(String[] args) {

		int num = 0;
		int num2 = num++;

		System.out.println("num: " + num);
		System.out.println("num2: " + num2);

		System.out.println("");
		
		int n = 0;
		int n2 = ++n;

		System.out.println("n: " + n);
		System.out.println("n2: " + n2);

		System.out.println("");
		
		int bananas = 6;
		int pears = bananas++;
		int apples = ++bananas;
		
		System.out.println("bananas: " + bananas);
		System.out.println("pears: " + pears);
		System.out.println("apples: " + apples);
		
		int p1 = 10;
		int sum = p1++ + 5;
		
		System.out.println("Sum: "+ sum);
		System.out.println("p1: "+ p1);
		
		
		int batteries = 8;
		int oldBatteries = 5;
		int totalBatteries = batteries++ + ++oldBatteries;
		
		System.out.println("Batteries: "+ batteries);//9
		System.out.println("oldBatteries: "+oldBatteries);//6
		System.out.println("totalBatteries: "+totalBatteries);//14 
		
		
		
		
		
		

	}

}
