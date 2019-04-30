package day15_string_manipulation;

public class StartsEndsWith {
	public static void main (String[] args) {
		String word1 = "eclipse";
		//starsWitch ==>tests if string starts with another string
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ecli"));
		
		System.out.println(word1.startsWith("Ec"));
		System.out.println(word1.startsWith("ipse"));
		System.out.println(word1.toUpperCase().startsWith("EC"));
		
		
		//Mr. Mrs. Ms. 
		String name = "Mr. Jackson";
		
		if (name.startsWith("Mr. ")) {
			System.out.println("man");
		}else if (name.startsWith("Mrs. ")) {
			System.out.println("married woman");
		}else if (name.startsWith("Ms. ")) {
			System.out.println("Some woman");
		}else if (name.startsWith("Dr. ")) {
			System.out.println("Doctor");
		}else {
			System.out.println("Alien");
		}
		
		
	}
}
