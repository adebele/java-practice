package day22_loopspractice2;

import java.util.*;

public class ValidMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int month;
		do {
			System.out.println("Enter month");
			month = scan.nextInt();
		}while(month>0 && month<13);
	
		System.out.println("Invalid month");
	}

}
