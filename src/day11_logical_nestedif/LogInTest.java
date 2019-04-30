package day11_logical_nestedif;

import java.util.*;
public class LogInTest {
	public static void main(String[] args) {
		
		String validUsername = "cybertek@mail.com";
		String validPassword = "WoodenSpoon123";
		
		String username, password;
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Please enter username");
		username = keyboard.next();
		
		System.out.println("Please enter password");
		password = keyboard.next();
		
		if ((username.equalsIgnoreCase(validUsername)) && (password.equals(validPassword))) {
			System.out.println("Login Successful, Welcome!");
		}
		//else 
			if (!(username.equalsIgnoreCase(validUsername)) && !(password.equals(validPassword))) {
			System.out.println("Invalid Username and Invalid Password");
		}
		//else 
			if ((username.equalsIgnoreCase(validUsername)) && !(password.equals(validPassword))) {
			System.out.println("Invalid Password");
		}
			//else
				if (!(username.equalsIgnoreCase(validUsername)) && (password.equals(validPassword))) {
				System.out.println("Invalid Username");
		}
		
		
		
		
		
	}
}
