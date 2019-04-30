package day08_casting_conditionals;


import java.util.Scanner;

public class PhoneNumberReplit {

	public static void main(String[] args) {

		//int areaCode, localNumber;
		
		//String phoneNumber;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Area Code: ");
		int areaCode = scan.nextInt();
		System.out.println("local number: ");
		int localNumber = scan.nextInt();
		
		String phoneNumber = ("Calling number ("+areaCode+")-"+localNumber);
		
		System.out.println(phoneNumber);
		
		
		
			}

}
