package day18_while_dowhile_loop;

import java.util.*;
public class PinCodeV2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int secretPincode = 4321;
		
		//give only 3 attempts
		//if attempts reaches more than 3 print "Card Blocked"
		
		int pincode = 0;
		int attempts = 1;
		
		while (pincode !=secretPincode && attempts <=3) {
			System.out.println("Enter pincode");
			pincode = scan.nextInt();
			attempts++;
		}
		
		if (pincode == secretPincode) {
			System.out.println("Access Granted");	
		}else if(attempts >=3) {
			System.out.println("Card is blocked");
		}
	
	}
}
