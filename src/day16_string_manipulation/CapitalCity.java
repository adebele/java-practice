package day16_string_manipulation;

public class CapitalCity {
	public static void main(String[] args) {
		String str = "Moscow is the capital of Russia.";
		str = str.replace("Moscow", "Baku").replace("Russia", "Azerbajan");
		System.out.println(str);
		
		String emailString = "firstName_LastName@gmail.com";
		String company = "deloitte";
		
		String newEmail = emailString.replace("gmail", company);
		System.out.println(newEmail);
		
	}
}
