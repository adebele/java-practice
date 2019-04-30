package day16_string_manipulation;

import java.util.*;

public class StringUrl {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String url = scan.next();

		if (url.startsWith("www.") && (url.lastIndexOf(".") <= url.length() - 4)) {
			System.out.println("URL starts with www");
			System.out.println("Domain: " + url.substring(url.indexOf(".") + 1, url.lastIndexOf(".")));
			System.out.println("Extension: " + url.substring((url.lastIndexOf(".") + 1), url.length()));

		} else {
			System.out.println("Enter a valid url.");
		}

	}
}
