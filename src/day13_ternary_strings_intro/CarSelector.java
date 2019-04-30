package day13_ternary_strings_intro;

import java.util.*;

public class CarSelector {
	public static void main(String[] args) {

		int carType;
		double averagePrice = 0.0;
		String carOptions = "", country = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Which type of car are you interested in?");
		System.out.println("1) American\n2) Japanese\n3) German\n4) Italian\n5) Korean");

		carType = scan.nextInt();
		
		switch (carType) {
		case 1:
			country = "American";
			averagePrice = 33000;
			carOptions = "Ford, Dodge, Tesla, Chevrolet, Lincoln";
			break;
		case 2:
			country = "Japanese";
			averagePrice = 32000;
			carOptions = "Toyota, Mitsubisi, Honda, Subaru, Mazda";
			break;
		case 3:
			country = "German";
			averagePrice = 55000;
			carOptions = "Bmw, VW, Audi, Mercedes, Porsche";
			break;
		case 4:
			country = "Italian";
			averagePrice = 85000;
			carOptions = "Alfa Romeo, Ferrari, Lamborghini, Fiat";
			break;
		case 5:
			country = "Korean";
			averagePrice = 25000;
			carOptions = "Kia, Hyundai, Daewoo";
			break;
		default:
			System.out.println("Car type not available");
			System.exit(0); //return;
		}
		System.out.println("You selected " + country + " car and your options are " + carOptions);
		System.out.println("Average Price: " + averagePrice);

	}

}
