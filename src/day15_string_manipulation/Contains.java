package day15_string_manipulation;

public class Contains {

	public static void main(String[] args) {

		String email = "test@gmail.com";
		System.out.println(email.contains("a"));

		String list = "potatoes, apples, tomatoes, eggs, milk, bread, cereal, meat";

		// check if apples is in the shopping list
		// true => Apples are there!
		// false => lets add apples now!

		if (list.contains("apples")) {
			System.out.println("Apples are there!");
		} else {
			System.out.println("lets add apples now!");
		}

		boolean hasEggs = list.contains("eggs");
		System.out.println("Contains eggs: " + hasEggs);

		boolean hasCucumbers = list.contains("cucumbers");
		System.out.println("Contains cucumbers: " + hasCucumbers);

		email = "name@yahoo.com";

		if (email.contains("@yahoo")) {
			System.out.println("It is a yahoo email");
		} else if (email.contains("@gmail")) {
			System.out.println("Gmail account");
		} else if (email.contains("@hotmail")) {
			System.out.println("Hotmail account");
		}

		// Assign your name and check if it contains "a" or "e" letters
		String name = "Abiy Debele";
		if ((name.contains("a")) || (name.contains("e"))) {
			System.out.println(name + " does contain a or e.");
		} else {
			System.out.println(name + " does not contain a or e.");
		}

	}
}
