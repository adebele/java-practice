package day13_ternary_strings_intro;

public class Ternary {
	public static void main(String[] args) {
		
		String result;
		int score = 48;
		if(score>60) {
			result = "pass";
		}else {
			result = "fail";
		}
		System.out.println("Result is "+result);
		 
	
		boolean test;
		String test1 = "yes";
		
		test = test1.equalsIgnoreCase("yes") ? true :false;
		
		System.out.println(test);
		
		result = score>60 ? "pass" :"fail";
		
		System.out.println("Result is "+result);
		
	}
}
