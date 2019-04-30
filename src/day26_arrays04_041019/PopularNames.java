package day26_arrays04_041019;

import java.util.Arrays;
import java.util.Random;

public class PopularNames {
	public static void main(String[] args) {
		String[] names = { "James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda", "William",
				"Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Charles",
				"Margaret", "Christopher", "Karen", "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty", "Donald",
				"Dorothy", "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna", "Kenneth",
				"Emily", "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa", "Edward",
				"Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura", "Jeffrey", "Helen", "Ryan",
				"Sharon", "Jacob", "Cynthia", "Gary", "Kathleen", "Nicholas", "Amy", "Eric", "Shirley", "Stephen",
				"Angela", "Jonathan", "Anna", "Larry", "Ruth", "Justin", "Brenda", "Scott", "Pamela", "Brandon",
				"Nicole", "Frank", "Katherine", "Benjamin", "Samantha", "Gregory", "Christine", "Raymond", "Catherine",
				"Samuel", "Virginia", "Patrick", "Debra", "Alexander", "Rachel", "Jack", "Janet", "Dennis", "Emma",
				"Jerry", "Carolyn", "Tyler", "Maria", "Aaron", "Heather", "Henry", "Diane", "Jose", "Julie", "Douglas",
				"Joyce", "Peter", "Evelyn", "Adam", "Joan", "Nathan", "Victoria", "Zachary", "Kelly", "Walter",
				"Christina", "Kyle", "Lauren", "Harold", "Frances", "Carl", "Martha", "Jeremy", "Judith", "Gerald",
				"Cheryl", "Keith", "Megan", "Roger", "Andrea", "Arthur", "Olivia", "Terry", "Ann", "Lawrence", "Jean",
				"Sean", "Alice", "Christian", "Jacqueline", "Ethan", "Hannah", "Austin", "Doris", "Joe", "Kathryn",
				"Albert", "Gloria", "Jesse", "Teresa", "Willie", "Sara", "Billy", "Janice", "Bryan", "Marie", "Bruce",
				"Julia", "Noah", "Grace", "Jordan", "Judy", "Dylan", "Theresa", "Ralph", "Madison", "Roy", "Beverly",
				"Alan", "Denise", "Wayne", "Marilyn", "Eugene", "Amber", "Juan", "Danielle", "Gabriel", "Rose", "Louis",
				"Brittany", "Russell", "Diana", "Randy", "Abigail", "Vincent", "Natalie", "Philip", "Jane", "Logan",
				"Lori", "Bobby", "Alexis", "Harry", "Tiffany", "Johnny", "Kayla" };

		// Print number of names in the array.
		System.out.println("Total names: " + names.length);
		// Print all number in single line
		System.out.println(Arrays.toString(names));
		// Print in column format.
		// 2 names in each line.

		System.out.println();
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ", " + names[++i]);
		}

		// print male names
		System.out.println();
		for (int j = 0; j < names.length; j += 2) {
			System.out.print(names[j] + ", ");
		}

		// print female names
		System.out.println("\n");
		for (int f = 1; f < names.length; f += 2) {
			System.out.print(names[f] + ", ");
		}

		// print female names with if statement
		System.out.println("\n");
		for (int g = 0; g < names.length; g++) {
			if (g % 2 != 0) {
				System.out.print(names[g] + ", ");
			}
		}
		System.out.println("\n");
		Random random = new Random();// is used to generate random number

		int randomIndex = random.nextInt(names.length - 1);
		System.out.println(names[randomIndex]);

		System.out.println();
		int count = 0;
		// Print names that are up to 4 characters, in uppercase, in one line.
		for (String name : names) {
			if (name.length() <= 4) {
				System.out.print(name.toUpperCase() + " ");
				count++;
			}
		}
		System.out.println("\n" + count);

		String namesupto4 = "";
		String names5to6 = "";
		String names7orMore = "";

		for (String name : names) {
			if (name.length() <= 4) {
				namesupto4 += name + ", ";
			} else if (name.length() >= 5 && name.length() <= 6) {
				names5to6 += name + ", ";
			} else if (name.length() >= 7) {
				names7orMore += name + ", ";
			}
		}

		System.out.println("\nNAMES LENGTH SORT");
		System.out.println("Names upto 4 characters: " + namesupto4);
		System.out.println("Names from 5 to 6 characters: " + names5to6);
		System.out.println("Names over 7 characters: " + names7orMore);

		// SWAP the female and male names
		System.out.println(Arrays.toString(names));

		for (int i = 0; i < names.length; i += 2) {

			String temp = names[i];
			names[i] = names[i + 1];
			names[i + 1] = temp;

		}

		System.out.println(Arrays.toString(names));
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
