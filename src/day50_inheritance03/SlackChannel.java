package day50_inheritance03;

import java.util.*;
public class SlackChannel {

	public static void main(String[] args) {
		
		SlackUser su = new SlackUser("Nadir");
		AdminUser au = new AdminUser("Florian");
		
		su.sendAMessage("public void search(String item, String item2) {\r\n" + 
				"		System.out.println(\"Searching for 2 items: \"+item+ \",\");\r\n" + 
				"		int resultsCount = item.length()+item2.length();\r\n" + 
				"		System.out.println(\"Total count: +resultsCount\");\r\n" + 
				"	}");
		au.sendAMessage("Thank you.");
		
		
		
	}
}
