package day11_logical_nestedif;

import java.util.*;

public class TollCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter Vehicle Type");// 1, 2
		int carType = input.nextInt();
		
		System.out.println("Is it rish hour: yes | no");
		String rushHour = input.next();
		
		boolean isRushHour;
		
		
		if (rushHour.equalsIgnoreCase("yes")) {
			isRushHour = true;
		}else /*if(rushHour.equalsIgnoreCase("no"))*/ {
			isRushHour = false;
		}
		
		//System.out.println(isRushHour);
		double price = 0.0;
		if (carType == 1) {
			if(isRushHour) {
				price = 30.0;
			}else {
				price = 5.0;
			}
		}else if (carType == 2) {
			if(isRushHour) {
				price = 50.30;
			}else {
				price = 10.99;
			}
		}
		

	}
}
